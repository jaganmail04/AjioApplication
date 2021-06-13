package com.cyient.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.LoginPage;
import com.cyient.utilities.DataProviderUtils;

public class signupTermsTest extends WebDriverWrapper {
	
	@Test(dataProvider = "termsAndConditionsExcelData", dataProviderClass = DataProviderUtils.class)
	public void validCredentialTest(String ExpectedValue) throws InterruptedException
	{
		LoginPage login = new LoginPage(driver);
		login.clickSignin();
		Thread.sleep(1000);
		login.clickTerms();
		Assert.assertTrue(driver.getTitle().contains(ExpectedValue));
	}
	
	

}
