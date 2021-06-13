package com.cyient.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {

@DataProvider
public Object[][] inValidCredentialExcelData() throws IOException{

	Object[][] main=ExcelUtils.getSheetIntoObjectArray("src\\test\\resources\\data\\Ajio.xls", "loginData");
	return main;
	
}

@DataProvider
public Object[][] termsAndConditionsExcelData() throws IOException{

	Object[][] main=ExcelUtils.getSheetIntoObjectArray("src\\test\\resources\\data\\Ajio.xls", "TermsData");
	return main;
	
}
  
}
