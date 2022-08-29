package org.genrals;
/**
 * This interface provies data file paths
 * @author Mr.Yog
 *
 */
public interface IFilePath {

	String ABSOLUTEPATH=System.getProperty("user.dir");
	public String PROPERTYFILEPATH =ABSOLUTEPATH+"\\src\\test\\resources\\appiumpropertydata.properties";
	public String EXCELPATH=ABSOLUTEPATH+"\\src\\main\\resources\\AppiumExcelData.xlsx";

}
