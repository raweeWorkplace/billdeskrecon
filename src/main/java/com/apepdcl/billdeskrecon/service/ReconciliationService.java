package com.apepdcl.billdeskrecon.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
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

import com.apepdcl.billdeskrecon.repo.ComplaintDetailsRepo;
import com.apepdcl.billdeskrecon.repo.NewConnectionRegisterRepo;

import javafx.util.Pair;

@SuppressWarnings("restriction")
@Service
public class ReconciliationService {

	@Autowired
	NewConnectionRegisterRepo newConRepo;

	@Autowired
	ComplaintDetailsRepo compRepo;
	
	@Value("${file_directory}")
	private String fileDirectory;
	
	
	public HSSFSheet convertFileToSheet(String path) {
		HSSFSheet sheet = null;
		try {
			FileInputStream file = new FileInputStream(
					new File(fileDirectory+"PV_APEPDCLONL_OPCIT2001162550646 (1).xls"));
			HSSFWorkbook workbook = new HSSFWorkbook(file);
			sheet = workbook.getSheetAt(0);
			workbook.close();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sheet;
	}
	
	
	public void verifyRecord(String path) {
		HSSFSheet sheet = convertFileToSheet(path);
		List<Pair<String,String>> pairs = getListOfRecords(sheet);
		boolean result= false;
		List<String> recordList = new ArrayList<String>();
		String recordData = null;
		for(Pair<?, ?> p:pairs) {
			
			if(p.getValue().equals("WEB_NEWCON")) {
				System.out.println("New Connection ::"+p.getKey());
				result=fetchNewConnectionRecord(p.getKey().toString());
				recordData=p.getKey() +"::"+result;
			}else if(p.getValue().equals("WEB_NAMECHANGE")) {
				System.out.println("Name Change ::"+p.getKey());
				result=fetchComplaintRecord(p.getKey().toString());
				recordData=p.getKey() +"::"+result;
			}else if(p.getValue().equals("WEB_CATCHANGE")) {
				System.out.println("Cat Change ::"+p.getKey());
				result=fetchComplaintRecord(p.getKey().toString());
				recordData=p.getKey() +"::"+result;
			}else if(p.getValue().equals("WEB_ADDL")) {
				System.out.println("Addl Load ::"+p.getKey());
				result=fetchNewConnectionRecord(p.getKey().toString());
				recordData=p.getKey() +"::"+result;
			}else {
				recordData = null;
			}
			recordList.add(recordData);
		}
		createFileResult(recordList);
		
	}
	
	public void createFileResult(List<String> resultList) {
		BufferedWriter writer = null;
        try {
            String timeLog = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
            File logFile = new File(fileDirectory+timeLog+".txt");
            System.out.println(logFile.getCanonicalPath());
            writer = new BufferedWriter(new FileWriter(logFile));
            for(String record:resultList) {
            	if(record!=null)
            	writer.write(record+"\n");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
            }
        }
	}
	
	

	public List<Pair<String,String>> getListOfRecords(HSSFSheet sheet) {
		List<Pair<String, String>> pairs = new ArrayList<Pair<String, String>>();
		int pgiCell = -1;
		int transTypeCell = -1;
		Iterator<Row> rowIterator = sheet.iterator();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				if (cell.getStringCellValue().trim().equals("PGI Ref. No.")) {
					pgiCell = cell.getColumnIndex();
				}
				if (cell.getStringCellValue().trim().equals("Ref. 4")) {
					transTypeCell = cell.getColumnIndex();
				}
			}
			if (pgiCell > 0 && transTypeCell > 0) {
				pairs.add(new Pair<String, String>(row.getCell(pgiCell).getStringCellValue(),
						row.getCell(transTypeCell).getStringCellValue()));
			}
		}
		return pairs;
	}
	
	@Transactional
	public boolean fetchNewConnectionRecord(String prno) {
		System.out.println(prno);
		return !newConRepo.getRecordByPrNo(prno).isEmpty()?true:false;
	}
	@Transactional
	public boolean fetchComplaintRecord(String prno) {
		return !compRepo.fetchComplaintIdByPrNo(prno).isEmpty()?true:false;
	}
}
