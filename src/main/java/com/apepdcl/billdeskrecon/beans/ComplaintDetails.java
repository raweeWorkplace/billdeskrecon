package com.apepdcl.billdeskrecon.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "COMPLAINT_DETAILS")
public class ComplaintDetails {
	@Id
	@Column
	private String ID;
	private String COMPLAINT_NO;
	private String COMPLAINT_NATUREID;
	private String COMPLAINT_DETAILS;
	private String NAME;
	@Temporal(TemporalType.TIMESTAMP)
	private Date COMPLAINT_GIVEN_ON;
	private String SCNO;
	private String STATUS;
	private String CREATED_BY;
	@Temporal(TemporalType.TIMESTAMP)
	private Date CREATE_DATE;
	private String RECORD_STATUS;
	private String IS_DISPATCHED;
	private String TOBEREC_DT;
	private String OFFICE_ID;
	private String NO_OF_HOLIDAYS;
	private String AREA_CODE;
	private String CENTER_CODE;
	private String HT_LTFLAG;
	private String MONTH;
	private String YEAR;
	private String DB_IP_ADDRESS;
	private String REQUEST_TYPE;
	private String LOCATION_TYPE;
	private String MOBILE;
	private String DOCUMENTS;
	private String CONTRACT_LOAD;
	private String IS_APPROVED;
	private String MTR_CHANGE_REQ;
	private String APPROVED_BY;
	private String CATEGORY;
	private String PHASE;
	private String CADDRESS_1;
	private String CADDRESS_4;
	private String CADDRESS_2;
	private String CAREA_NAME;
	private String POLENUM;
	private String STREET;
	private String CONS_ID;
	private String PENDING_AT;
	private String EMAIL_DETAILS;
	private String CAREA_NAME1;
	private String MOBILE_NUM;
	private String ADDRESS_2;
	private String ADDRESS_4;
	private String COMPLAINANT_NAME;
	private Date UPDATE_DATE;
	private String UPDATED_BY;
//	private String PHONE;
	private String CATEGORY_ID;
	private String FORWARDED_OFFICE_ID;
	private String DOORNO;
	private String MEESEVAREGNO;
	private String SOURCE;
	private String PINCODE;
//	private String MOBILE_NO;
	private String COMPLAINANTS_NAME;
	private String TOWN1;
	private String ADDRESS;
	private String ADDRESS_1;
//	private String TEST_COMPLAINT_DETAILS;
	private String AADHAR_NO;
	private String FORM_ID;
	private String STATUSTEXT;
	private String CUSTOMER_HISTORY;
	private Date ESCALATION1_DT;
	private Date ESCALTN2_DT;
	private String AMOUNT;
	private String SEC_CODE;
	private String PRNO;
//	private String PR_NO;
	private String MTR_PHASE;
	private String RELATION;
	private String NEW_NAME;
	private String GUARDIAN_NAME;
	private String SUR_NAME;
	private String PAY_MODE;
	private String CC_NAME;	
	private String CC_CODE;
	private Date TOBEPAYMENT_INT_DT;
	
	private String SD_AMT;
	private String FORM_SUBMITED_BY;
	//private Date PAYMENTDT;
	//private String AKNOWLEDGEON;
	private String REASON;
	private String SD_AVAILABLE;
	private String NEW_CAT;
	private Date PR_GIVEN_ON;
	private Date RECTIFIED_ON;
	private String TOKEN_NO;
	private String TEMP_DAYS;
	
	
	public String getTEMP_DAYS() {
		return TEMP_DAYS;
	}
	public void setTEMP_DAYS(String tEMP_DAYS) {
		TEMP_DAYS = tEMP_DAYS;
	}
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getCOMPLAINT_NO() {
		return COMPLAINT_NO;
	}
	public void setCOMPLAINT_NO(String cOMPLAINT_NO) {
		COMPLAINT_NO = cOMPLAINT_NO;
	}
	public String getCOMPLAINT_NATUREID() {
		return COMPLAINT_NATUREID;
	}
	public void setCOMPLAINT_NATUREID(String cOMPLAINT_NATUREID) {
		COMPLAINT_NATUREID = cOMPLAINT_NATUREID;
	}
	public String getCOMPLAINT_DETAILS() {
		return COMPLAINT_DETAILS;
	}
	public void setCOMPLAINT_DETAILS(String cOMPLAINT_DETAILS) {
		COMPLAINT_DETAILS = cOMPLAINT_DETAILS;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getSCNO() {
		return SCNO;
	}
	public void setSCNO(String sCNO) {
		SCNO = sCNO;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getCREATED_BY() {
		return CREATED_BY;
	}
	public void setCREATED_BY(String cREATED_BY) {
		CREATED_BY = cREATED_BY;
	}
	public Date getCREATE_DATE() {
		return CREATE_DATE;
	}
	public void setCREATE_DATE(Date cREATE_DATE) {
		CREATE_DATE = cREATE_DATE;
	}
	public String getRECORD_STATUS() {
		return RECORD_STATUS;
	}
	public void setRECORD_STATUS(String rECORD_STATUS) {
		RECORD_STATUS = rECORD_STATUS;
	}
	public String getIS_DISPATCHED() {
		return IS_DISPATCHED;
	}
	public void setIS_DISPATCHED(String iS_DISPATCHED) {
		IS_DISPATCHED = iS_DISPATCHED;
	}
	public String getTOBEREC_DT() {
		return TOBEREC_DT;
	}
	public void setTOBEREC_DT(String tOBEREC_DT) {
		TOBEREC_DT = tOBEREC_DT;
	}
	public String getOFFICE_ID() {
		return OFFICE_ID;
	}
	public void setOFFICE_ID(String oFFICE_ID) {
		OFFICE_ID = oFFICE_ID;
	}
	public String getNO_OF_HOLIDAYS() {
		return NO_OF_HOLIDAYS;
	}
	public void setNO_OF_HOLIDAYS(String nO_OF_HOLIDAYS) {
		NO_OF_HOLIDAYS = nO_OF_HOLIDAYS;
	}
	public String getAREA_CODE() {
		return AREA_CODE;
	}
	public void setAREA_CODE(String aREA_CODE) {
		AREA_CODE = aREA_CODE;
	}
	public String getCENTER_CODE() {
		return CENTER_CODE;
	}
	public void setCENTER_CODE(String cENTER_CODE) {
		CENTER_CODE = cENTER_CODE;
	}
	public String getHT_LTFLAG() {
		return HT_LTFLAG;
	}
	public void setHT_LTFLAG(String hT_LTFLAG) {
		HT_LTFLAG = hT_LTFLAG;
	}
	public String getMONTH() {
		return MONTH;
	}
	public void setMONTH(String mONTH) {
		MONTH = mONTH;
	}
	public String getYEAR() {
		return YEAR;
	}
	public void setYEAR(String yEAR) {
		YEAR = yEAR;
	}
	public String getDB_IP_ADDRESS() {
		return DB_IP_ADDRESS;
	}
	public void setDB_IP_ADDRESS(String dB_IP_ADDRESS) {
		DB_IP_ADDRESS = dB_IP_ADDRESS;
	}
	public String getREQUEST_TYPE() {
		return REQUEST_TYPE;
	}
	public void setREQUEST_TYPE(String rEQUEST_TYPE) {
		REQUEST_TYPE = rEQUEST_TYPE;
	}
	public String getLOCATION_TYPE() {
		return LOCATION_TYPE;
	}
	public void setLOCATION_TYPE(String lOCATION_TYPE) {
		LOCATION_TYPE = lOCATION_TYPE;
	}
	public String getMOBILE() {
		return MOBILE;
	}
	public void setMOBILE(String mOBILE) {
		MOBILE = mOBILE;
	}
	public String getDOCUMENTS() {
		return DOCUMENTS;
	}
	public void setDOCUMENTS(String dOCUMENTS) {
		DOCUMENTS = dOCUMENTS;
	}
	public String getCONTRACT_LOAD() {
		return CONTRACT_LOAD;
	}
	public void setCONTRACT_LOAD(String cONTRACT_LOAD) {
		CONTRACT_LOAD = cONTRACT_LOAD;
	}
	public String getIS_APPROVED() {
		return IS_APPROVED;
	}
	public void setIS_APPROVED(String iS_APPROVED) {
		IS_APPROVED = iS_APPROVED;
	}
	public String getMTR_CHANGE_REQ() {
		return MTR_CHANGE_REQ;
	}
	public void setMTR_CHANGE_REQ(String mTR_CHANGE_REQ) {
		MTR_CHANGE_REQ = mTR_CHANGE_REQ;
	}
	public String getAPPROVED_BY() {
		return APPROVED_BY;
	}
	public void setAPPROVED_BY(String aPPROVED_BY) {
		APPROVED_BY = aPPROVED_BY;
	}
	public String getCATEGORY() {
		return CATEGORY;
	}
	public void setCATEGORY(String cATEGORY) {
		CATEGORY = cATEGORY;
	}
	public String getPHASE() {
		return PHASE;
	}
	public void setPHASE(String pHASE) {
		PHASE = pHASE;
	}
	public String getCADDRESS_1() {
		return CADDRESS_1;
	}
	public void setCADDRESS_1(String cADDRESS_1) {
		CADDRESS_1 = cADDRESS_1;
	}
	public String getCADDRESS_4() {
		return CADDRESS_4;
	}
	public void setCADDRESS_4(String cADDRESS_4) {
		CADDRESS_4 = cADDRESS_4;
	}
	public String getCADDRESS_2() {
		return CADDRESS_2;
	}
	public void setCADDRESS_2(String cADDRESS_2) {
		CADDRESS_2 = cADDRESS_2;
	}
	public String getCAREA_NAME() {
		return CAREA_NAME;
	}
	public void setCAREA_NAME(String cAREA_NAME) {
		CAREA_NAME = cAREA_NAME;
	}
	public String getPOLENUM() {
		return POLENUM;
	}
	public void setPOLENUM(String pOLENUM) {
		POLENUM = pOLENUM;
	}
	public String getSTREET() {
		return STREET;
	}
	public void setSTREET(String sTREET) {
		STREET = sTREET;
	}
	public String getCONS_ID() {
		return CONS_ID;
	}
	public void setCONS_ID(String cONS_ID) {
		CONS_ID = cONS_ID;
	}
	public String getPENDING_AT() {
		return PENDING_AT;
	}
	public void setPENDING_AT(String pENDING_AT) {
		PENDING_AT = pENDING_AT;
	}
	public String getEMAIL_DETAILS() {
		return EMAIL_DETAILS;
	}
	public void setEMAIL_DETAILS(String eMAIL_DETAILS) {
		EMAIL_DETAILS = eMAIL_DETAILS;
	}
	public String getCAREA_NAME1() {
		return CAREA_NAME1;
	}
	public void setCAREA_NAME1(String cAREA_NAME1) {
		CAREA_NAME1 = cAREA_NAME1;
	}
	public String getMOBILE_NUM() {
		return MOBILE_NUM;
	}
	public void setMOBILE_NUM(String mOBILE_NUM) {
		MOBILE_NUM = mOBILE_NUM;
	}
	public String getADDRESS_2() {
		return ADDRESS_2;
	}
	public void setADDRESS_2(String aDDRESS_2) {
		ADDRESS_2 = aDDRESS_2;
	}
	public String getADDRESS_4() {
		return ADDRESS_4;
	}
	public void setADDRESS_4(String aDDRESS_4) {
		ADDRESS_4 = aDDRESS_4;
	}
	public String getCOMPLAINANT_NAME() {
		return COMPLAINANT_NAME;
	}
	public void setCOMPLAINANT_NAME(String cOMPLAINANT_NAME) {
		COMPLAINANT_NAME = cOMPLAINANT_NAME;
	}
	String getCATEGORY_ID() {
		return CATEGORY_ID;
	}
	public void setCATEGORY_ID(String cATEGORY_ID) {
		CATEGORY_ID = cATEGORY_ID;
	}
	public String getFORWARDED_OFFICE_ID() {
		return FORWARDED_OFFICE_ID;
	}
	public void setFORWARDED_OFFICE_ID(String fORWARDED_OFFICE_ID) {
		FORWARDED_OFFICE_ID = fORWARDED_OFFICE_ID;
	}
	public String getDOORNO() {
		return DOORNO;
	}
	public void setDOORNO(String dOORNO) {
		DOORNO = dOORNO;
	}
	public String getMEESEVAREGNO() {
		return MEESEVAREGNO;
	}
	public void setMEESEVAREGNO(String mEESEVAREGNO) {
		MEESEVAREGNO = mEESEVAREGNO;
	}
	public String getSOURCE() {
		return SOURCE;
	}
	public void setSOURCE(String sOURCE) {
		SOURCE = sOURCE;
	}
	public String getPINCODE() {
		return PINCODE;
	}
	public void setPINCODE(String pINCODE) {
		PINCODE = pINCODE;
	}

	public String getCOMPLAINANTS_NAME() {
		return COMPLAINANTS_NAME;
	}
	public void setCOMPLAINANTS_NAME(String cOMPLAINANTS_NAME) {
		COMPLAINANTS_NAME = cOMPLAINANTS_NAME;
	}
	public String getTOWN1() {
		return TOWN1;
	}
	public void setTOWN1(String tOWN1) {
		TOWN1 = tOWN1;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public String getADDRESS_1() {
		return ADDRESS_1;
	}
	public void setADDRESS_1(String aDDRESS_1) {
		ADDRESS_1 = aDDRESS_1;
	}

	public String getAADHAR_NO() {
		return AADHAR_NO;
	}
	public void setAADHAR_NO(String aADHAR_NO) {
		AADHAR_NO = aADHAR_NO;
	}
	public String getFORM_ID() {
		return FORM_ID;
	}
	public void setFORM_ID(String fORM_ID) {
		FORM_ID = fORM_ID;
	}
	public String getSTATUSTEXT() {
		return STATUSTEXT;
	}
	public void setSTATUSTEXT(String sTATUSTEXT) {
		STATUSTEXT = sTATUSTEXT;
	}
	public String getCUSTOMER_HISTORY() {
		return CUSTOMER_HISTORY;
	}
	public void setCUSTOMER_HISTORY(String cUSTOMER_HISTORY) {
		CUSTOMER_HISTORY = cUSTOMER_HISTORY;
	}
	public Date getESCALATION1_DT() {
		return ESCALATION1_DT;
	}
	public void setESCALATION1_DT(Date eSCALATION1_DT) {
		ESCALATION1_DT = eSCALATION1_DT;
	}
	public Date getESCALTN2_DT() {
		return ESCALTN2_DT;
	}
	public void setESCALTN2_DT(Date eSCALTN2_DT) {
		ESCALTN2_DT = eSCALTN2_DT;
	}
	public String getAMOUNT() {
		return AMOUNT;
	}
	public void setAMOUNT(String aMOUNT) {
		AMOUNT = aMOUNT;
	}
	public String getSEC_CODE() {
		return SEC_CODE;
	}
	public void setSEC_CODE(String sEC_CODE) {
		SEC_CODE = sEC_CODE;
	}
	public String getPRNO() {
		return PRNO;
	}
	public void setPRNO(String pRNO) {
		PRNO = pRNO;
	}

	public String getMTR_PHASE() {
		return MTR_PHASE;
	}
	public void setMTR_PHASE(String mTR_PHASE) {
		MTR_PHASE = mTR_PHASE;
	}
	public String getRELATION() {
		return RELATION;
	}
	public void setRELATION(String rELATION) {
		RELATION = rELATION;
	}
	public String getNEW_NAME() {
		return NEW_NAME;
	}
	public void setNEW_NAME(String nEW_NAME) {
		NEW_NAME = nEW_NAME;
	}
	public String getGUARDIAN_NAME() {
		return GUARDIAN_NAME;
	}
	public void setGUARDIAN_NAME(String gUARDIAN_NAME) {
		GUARDIAN_NAME = gUARDIAN_NAME;
	}
	public String getSUR_NAME() {
		return SUR_NAME;
	}
	public void setSUR_NAME(String sUR_NAME) {
		SUR_NAME = sUR_NAME;
	}
	public String getPAY_MODE() {
		return PAY_MODE;
	}
	public void setPAY_MODE(String pAY_MODE) {
		PAY_MODE = pAY_MODE;
	}
	public String getCC_NAME() {
		return CC_NAME;
	}
	public void setCC_NAME(String cC_NAME) {
		CC_NAME = cC_NAME;
	}
	public void setCOMPLAINT_GIVEN_ON(Date cOMPLAINT_GIVEN_ON) {
		COMPLAINT_GIVEN_ON = cOMPLAINT_GIVEN_ON;
	}
	public Date getTOBEPAYMENT_INT_DT() {
		return TOBEPAYMENT_INT_DT;
	}
	public void setTOBEPAYMENT_INT_DT(Date tOBEPAYMENT_INT_DT) {
		TOBEPAYMENT_INT_DT = tOBEPAYMENT_INT_DT;
	}
	public Date getCOMPLAINT_GIVEN_ON() {
		return COMPLAINT_GIVEN_ON;
	}
	public String getCC_CODE() {
		return CC_CODE;
	}
	public void setCC_CODE(String cC_CODE) {
		CC_CODE = cC_CODE;
	}
	public String getFORM_SUBMITED_BY() {
		return FORM_SUBMITED_BY;
	}
	public void setFORM_SUBMITED_BY(String fORM_SUBMITED_BY) {
		FORM_SUBMITED_BY = fORM_SUBMITED_BY;
	}

//	public String getAKNOWLEDGEON() {
//		return AKNOWLEDGEON;
//	}
//	public void setAKNOWLEDGEON(String aKNOWLEDGEON) {
//		AKNOWLEDGEON = aKNOWLEDGEON;
//	}
	public String getREASON() {
		return REASON;
	}
	public void setREASON(String rEASON) {
		REASON = rEASON;
	}
	public String getSD_AVAILABLE() {
		return SD_AVAILABLE;
	}
	public void setSD_AVAILABLE(String sD_AVAILABLE) {
		SD_AVAILABLE = sD_AVAILABLE;
	}
	public String getNEW_CAT() {
		return NEW_CAT;
	}
	public void setNEW_CAT(String nEW_CAT) {
		NEW_CAT = nEW_CAT;
	}
	public Date getPR_GIVEN_ON() {
		return PR_GIVEN_ON;
	}
	public void setPR_GIVEN_ON(Date pR_GIVEN_ON) {
		PR_GIVEN_ON = pR_GIVEN_ON;
	}
	public Date getRECTIFIED_ON() {
		return RECTIFIED_ON;
	}
	public void setRECTIFIED_ON(Date rECTIFIED_ON) {
		RECTIFIED_ON = rECTIFIED_ON;
	}
	public String getTOKEN_NO() {
		return TOKEN_NO;
	}
	public void setTOKEN_NO(String tOKEN_NO) {
		TOKEN_NO = tOKEN_NO;
	}
	public String getSD_AMT() {
		return SD_AMT;
	}
	public void setSD_AMT(String sD_AMT) {
		SD_AMT = sD_AMT;
	}
//	public Date getPAYMENTDT() {
//		return PAYMENTDT;
//	}
//	public void setPAYMENTDT(Date pAYMENTDT) {
//		PAYMENTDT = pAYMENTDT;
//	}
	public Date getUPDATE_DATE() {
		return UPDATE_DATE;
	}
	public void setUPDATE_DATE(Date uPDATE_DATE) {
		UPDATE_DATE = uPDATE_DATE;
	}
	public String getUPDATED_BY() {
		return UPDATED_BY;
	}
	public void setUPDATED_BY(String uPDATED_BY) {
		UPDATED_BY = uPDATED_BY;
	}
	
	

}
