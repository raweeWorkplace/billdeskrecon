package com.apepdcl.billdeskrecon.utils;

import com.apepdcl.billdeskrecon.service.ReconciliationService;

public class Test {
	public static void main(String[] args) {

//		OfficeDetailsDTO officeDetailsDTO = new OfficeDetailsDTO();
//		officeDetailsDTO.setSECCODE_M("282");
//		officeDetailsDTO.setCIRCLEID_M("930");
//
//		ConnectionDetailsDTO connectionDetailsDTO = new ConnectionDetailsDTO();
//		connectionDetailsDTO.setLOAD_M("2");
//		connectionDetailsDTO.setPHASE_M("1");
//		connectionDetailsDTO.setCATEGORYID_M("20201");
//
//		PaydetailsDTO paydetailsDTO = new PaydetailsDTO();
//		paydetailsDTO.setPRNO_M("545645");
//		paydetailsDTO.setAPPFEE_M("545");
//
//		CommunicationAddressDTO communicationAddressDTO = new CommunicationAddressDTO();
//		communicationAddressDTO.setCDOORNUM_M("2-59");
//		communicationAddressDTO.setCSTREETNAME_M("Gandhi");
//
//		PremisesAddressDTO premisesAddressDTO = new PremisesAddressDTO();
//		premisesAddressDTO.setDOORNUM_M("4-7");
//		premisesAddressDTO.setSTREETNAME_M("Lokulu");
//
//		List<DocumentDTO> list = new ArrayList<DocumentDTO>();
//
//		DocumentDTO documentDTO = new DocumentDTO();
//		documentDTO.setNOOFCOPIES("2");
//		documentDTO.setDOCUMENT("adhaar");
//
//		DocumentDTO documentDTO1 = new DocumentDTO();
//		documentDTO1.setNOOFCOPIES("2");
//		documentDTO1.setDOCUMENT("adhaar");
//
//		DocumentDTO documentDTO2 = new DocumentDTO();
//		documentDTO2.setNOOFCOPIES("2");
//		documentDTO2.setDOCUMENT("adhaar");
//		list.add(documentDTO);
//		list.add(documentDTO1);
//		list.add(documentDTO2);
//		RequestJsonDTO request = new RequestJsonDTO();
//		request.setREGNUMBER_M("Ranjan");
//		request.setSURNAME_M("Mallik");
//		request.setCUSTOMERNAME_M("ran");
//		request.setFATHERHUSBANDNAME_M("same");
//		request.setMOBILENO_M("54545442");
//		request.setEMAILID_NM("udhf");
//		request.setAPPSUBMITTEDBY_M("Praveen");
//		request.setIPADDRESS_M("15.25432.456");
//
//		request.setOFFICEDETAILS_M(officeDetailsDTO);
//		request.setCONNECTIONDETAILS_M(connectionDetailsDTO);
//		request.setPAYMENTDETAILS_M(paydetailsDTO);
//		request.setCOMMNICATIONADDRESS_M(communicationAddressDTO);
//		request.setPREMISESADDRESS_M(premisesAddressDTO);
//		request.setDOCUMENTDETAILS_M(list);
//		
//		Gson gs = new Gson();
//		System.out.println(gs.toJson(request).toString());
//		
//		System.out.println(Parser.toDate("12-12-2019"));
//		
//		System.out.println("DATE in newcon is:: "+neconndate);
//		int dd = Integer.parseInt(neconndate.substring(0,2));
//		System.out.println("DD in newcon is:: "+dd);
//		int mm = Integer.parseInt(neconndate.substring(3,5)) * 100;
//		System.out.println("MM in newcon is:: "+mm);
//		int yy = Integer.parseInt(neconndate.substring(6,10)) * 10000;
//		System.out.println("YYYY in newcon is:: "+yy);
//		int newcondatecheck = yy + mm + dd;
//		if(newcondatecheck<=compareDate){
//			System.out.println("checked");
//		}
//		try {
//			FileInputStream file = new FileInputStream(
//					new File("C:\\Users\\CORP-IT-PC-59\\Desktop\\PV_APEPDCLONL_OPCIT2001162550646 (1).xls"));
//
//			// Create Workbook instance holding reference to .xlsx file
//			HSSFWorkbook workbook = new HSSFWorkbook(file);
//
//			// Get first/desired sheet from the workbook
//			HSSFSheet sheet = workbook.getSheetAt(0);
//			// Iterate through each rows one by one
//			Iterator<Row> rowIterator = sheet.iterator();
//			
//			List<Pair<String,String>> pairs = new ArrayList<Pair<String,String>>();
//			int pgiCell =-1;
//			int transTypeCell =-1;
//			while (rowIterator.hasNext()) {
//				
//				Row row = rowIterator.next();
//				// For each row, iterate through all the columns
//				Iterator<Cell> cellIterator = row.cellIterator();			
//				
//				while (cellIterator.hasNext()) {
//					Cell cell = cellIterator.next();
//					
//					// Check the cell type and format accordingly
//					
//						if(cell.getStringCellValue().trim().equals("PGI Ref. No.")) {
//							pgiCell=cell.getColumnIndex();					
//						}
//						
//						if(cell.getStringCellValue().trim().equals("Ref. 4")) {
//							transTypeCell=cell.getColumnIndex();
//						}						
//				}
//				if(pgiCell>0 && transTypeCell>0) {
//					pairs.add(new Pair<String,String>(row.getCell(pgiCell).getStringCellValue(), row.getCell(transTypeCell).getStringCellValue()));
//				}
//			}
////			System.out.println(pairs);
//			workbook.close();
//			file.close();
//			for(Pair<?, ?> p:pairs) {
//				
//				if(p.getValue().equals("WEB_NEWCON")) {
//					System.out.println("New Connection ::"+p.getKey());
//				}else if(p.getValue().equals("WEB_NAMECHANGE")) {
//					System.out.println("Name Change ::"+p.getKey());
//				}else if(p.getValue().equals("WEB_CATCHANGE")) {
//					System.out.println("Cat Change ::"+p.getKey());
//				}else if(p.getValue().equals("WEB_ADDL")) {
//					System.out.println("Addl Load ::"+p.getKey());
//				}
//				
//			}
//			
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		new ReconciliationService().verifyRecord("");
}
}
