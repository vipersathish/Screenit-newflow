package com.Test.utility;


import java.util.ArrayList;

import com.excel.lib.util.Xls_Reader;

public class TestUtils {
	
	static Xls_Reader reader ;
	
	public static ArrayList<Object[]> getDataFromExcel(){
		
		
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		
		try{
		reader = new Xls_Reader("C:\\Users\\TTS-USER\\workspace\\com.TrueTech.ScreenIT.NewFlow\\ExcelSheet\\ScreenitFlowExcelSheet.xlsx");
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		for(int rowNum=2;rowNum<= reader.getRowCount("ScreenitFlowPage");rowNum++){
			
			String Email = reader.getCellData("ScreenitFlowPage", "Email", rowNum);
			
			String password = reader.getCellData("ScreenitFlowPage", "Password", rowNum);
			
			String file = reader.getCellData("ScreenitFlowPage", "file", rowNum);
			
			String year = reader.getCellData("ScreenitFlowPage", "year", rowNum);
			
			String month = reader.getCellData("ScreenitFlowPage", "month", rowNum);
			
			String primaryskill = reader.getCellData("Remark", "PrimarySkill", rowNum);
			
			String secondaryskill = reader.getCellData("ScreenitFlowPage", "SecondarySkill", rowNum);
			
			String jobdescription = reader.getCellData("ScreenitFlowPage", "JobDescription", rowNum);
			
			String remark = reader.getCellData("ScreenitFlowPage", "Remark", rowNum);
			
			String selectsingleinterviewer = reader.getCellData("ScreenitFlowPage", "SelectSingleInterviewer", rowNum);
			
//			String selectmultiinterviewer = reader.getCellData("ScreenitFlowPage", "ChooseAnotherInterviewer", rowNum);
//			
//			String uploadcandidateresume = reader.getCellData("ScreenitFlowPage", "UploadCandidateResume", rowNum);
//			
//			String selectdate = reader.getCellData("ScreenitFlowPage", "SelectDate", rowNum);
//			
//			String selecttime = reader.getCellData("ScreenitFlowPage", "SelectTime", rowNum);
//			
//			String selectsec = reader.getCellData("ScreenitFlowPage", "SelectSec", rowNum);
//			
//			String selectsuffix = reader.getCellData("ScreenitFlowPage", "SelectSuffix", rowNum);
//			
//			String anotherselectdate =  reader.getCellData("ScreenitFlowPage", "AnotherSelectDate", rowNum);
//					
//			String anotherselecttime =  reader.getCellData("ScreenitFlowPage", "AnotherSelectTime", rowNum);
//			
//			String anotherselectsec =  reader.getCellData("ScreenitFlowPage", "AnotherSelectSec", rowNum);
//			
//			String anotherselectsuffix =  reader.getCellData("ScreenitFlowPage", "AnotherSelectSuffix", rowNum);
//			
//			String selectresaon = reader.getCellData("ScreenitFlowPage", "SelectReason", rowNum);
//			
//			String selectcomment = reader.getCellData("ScreenitFlowPage", "SelectComments", rowNum);
//			
			
//			Object ob[]= {Email ,password,file,year,month,primaryskill,secondaryskill,jobdescription,remark,selectsingleinterviewer,selectmultiinterviewer,
//	uploadcandidateresume,selectdate,selecttime,selectsec,selectsuffix,anotherselectdate,anotherselecttime,anotherselectsec,anotherselectsuffix,selectresaon,selectcomment	
//			};
			
			Object ob[]= {Email ,password,file,year,month,primaryskill,secondaryskill,jobdescription,remark,selectsingleinterviewer};
			
			
			mydata.add(ob);
		}
		
		return mydata;
		
	}

}
