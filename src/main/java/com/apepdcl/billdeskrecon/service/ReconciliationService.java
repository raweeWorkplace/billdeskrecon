package com.apepdcl.billdeskrecon.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
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
	
	
	public HSSFSheet convertFileToSheet(String path) {
		HSSFSheet sheet = null;
		try {
			FileInputStream file = new FileInputStream(
					new File(path));
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
		for(Pair<?, ?> p:pairs) {
			
			if(p.getValue().equals("WEB_NEWCON")) {
				System.out.println("New Connection ::"+p.getKey());
				result=fetchNewConnectionRecord(p.getKey().toString());
			}else if(p.getValue().equals("WEB_NAMECHANGE")) {
				System.out.println("Name Change ::"+p.getKey());
				result=fetchComplaintRecord(p.getKey().toString());
			}else if(p.getValue().equals("WEB_CATCHANGE")) {
				System.out.println("Cat Change ::"+p.getKey());
				result=fetchComplaintRecord(p.getKey().toString());
			}else if(p.getValue().equals("WEB_ADDL")) {
				System.out.println("Addl Load ::"+p.getKey());
				result=fetchNewConnectionRecord(p.getKey().toString());
			}
			
			System.out.println("Result :: "+ result);
			
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
