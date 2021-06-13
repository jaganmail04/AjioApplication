package com.cyient.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.LoginPage;
import com.cyient.utilities.DataProviderUtils;


public class LoginTest extends WebDriverWrapper {
	
	@Test(dataProvider = "inValidCredentialExcelData", dataProviderClass = DataProviderUtils.class)
	public void inValidCredentialTest(String ExpectedValue) throws InterruptedException
	{
		LoginPage login = new LoginPage(driver);
		login.clickSignin();
		login.clickContine();
	
		Assert.assertEquals(login.invalidText(), ExpectedValue);
	}
	

}
