package org.genrals;

import org.testng.annotations.Test;

public class Try001 {
	String data;
	@Test
	public void DataProvider() throws Throwable {
		DataHandler data = new DataHandler();
//		data.initExcelFile(IFilePath.EXCELPATH);
//		return data.getDataFromExcel(1, 1, "aapiumdata");
		data.intiallizeProperyFile(IFilePath.PROPERTYFILEPATH);
		 String pass = data.getDataFromProperty("Password");
		 String apppackage = data.getDataFromProperty("appPackage");
		 String appActicvity = data.getDataFromProperty("appActivity");
		System.out.println(pass+apppackage+appActicvity);
	
	}
	
	
	
	

}
