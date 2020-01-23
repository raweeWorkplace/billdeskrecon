package com.apepdcl.billdeskrecon.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.apepdcl.billdeskrecon.repo.ComplaintDetailsRepo;
import com.apepdcl.billdeskrecon.repo.NewConnectionRegisterRepo;

import javafx.util.Pair;

@Service
public class ReconciliationService {

	@Autowired
	NewConnectionRegisterRepo newConRepo;

	@Autowired
	ComplaintDetailsRepo compRepo;

	@Value("${file_directory}")
	private String fileDirectory;

	String timeLog = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

	public HSSFSheet convertFileToSheet(MultipartFile file) throws Exception {
		HSSFSheet sheet = null;
		byte[] bytes = file.getBytes();

		Path path = Paths.get(fileDirectory + timeLog + ".xls");
		Files.write(path, bytes);
		FileInputStream newfile = new FileInputStream(new File(path.toString()));
		HSSFWorkbook workbook = new HSSFWorkbook(newfile);
		sheet = workbook.getSheetAt(0);
		workbook.close();
		newfile.close();
		return sheet;
	}

	public boolean verifyRecord(MultipartFile file) {
		boolean response = false;
		try {
			HSSFSheet sheet = convertFileToSheet(file);
			List<Pair<String, String>> pairs = getListOfRecords(sheet);
			boolean result = false;
			List<String> recordList = new ArrayList<String>();
			String recordData = null;
			for (Pair<?, ?> p : pairs) {
				if (p.getValue().equals("WEB_NEWCON")) {
					System.out.println("New Connection ::" + p.getKey());
					result = fetchNewConnectionRecord(p.getKey().toString());
					recordData = p.getKey() + "::" + result;
				} else if (p.getValue().equals("WEB_NAMECHANGE")) {
					System.out.println("Name Change ::" + p.getKey());
					result = fetchComplaintRecord(p.getKey().toString());
					recordData = p.getKey() + "::" + result;
				} else if (p.getValue().equals("WEB_CATCHANGE")) {
					System.out.println("Cat Change ::" + p.getKey());
					result = fetchComplaintRecord(p.getKey().toString());
					recordData = p.getKey() + "::" + result;
				} else if (p.getValue().equals("WEB_ADDL")) {
					System.out.println("Addl Load ::" + p.getKey());
					result = fetchNewConnectionRecord(p.getKey().toString());
					recordData = p.getKey() + "::" + result;
				} else {
					recordData = null;
				}
				recordList.add(recordData);
			}
			createFileResult(recordList);
			response = true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return response;
	}

	public void createFileResult(List<String> resultList) throws Exception {
		BufferedWriter writer = null;
		File logFile = new File(fileDirectory + timeLog + ".txt");
		System.out.println(logFile.getCanonicalPath());
		writer = new BufferedWriter(new FileWriter(logFile));
		for (String record : resultList) {
			if (record != null)
				writer.write(record + "\n");
		}
		writer.close();
	}

	public List<Pair<String, String>> getListOfRecords(HSSFSheet sheet) {
		List<Pair<String, String>> pairs = new ArrayList<Pair<String, String>>();
		try {
			int pgiCell = -1;
			int transTypeCell = -1;
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				if (pgiCell == -1 || transTypeCell == -1) {
					while (cellIterator.hasNext()) {
						Cell cell = cellIterator.next();
						if (cell.getStringCellValue().trim().equals("PGI Ref. No.")) {
							pgiCell = cell.getColumnIndex();
						}
						if (cell.getStringCellValue().trim().equals("Ref. 4")) {
							transTypeCell = cell.getColumnIndex();
						}
					}
				}

				if (pgiCell > 0 && transTypeCell > 0) {
					pairs.add(new Pair<String, String>(row.getCell(pgiCell).getStringCellValue(),
							row.getCell(transTypeCell).getStringCellValue()));
				}
				System.out.println(pairs.toString());
			}
		} catch (Exception e) {
		}
		return pairs;
	}

	@Transactional
	public boolean fetchNewConnectionRecord(String prno) {
		System.out.println(prno);
		return !newConRepo.getRecordByPrNo(prno).isEmpty() ? true : false;
	}

	@Transactional
	public boolean fetchComplaintRecord(String prno) {
		return !compRepo.fetchComplaintIdByPrNo(prno).isEmpty() ? true : false;
	}
}
