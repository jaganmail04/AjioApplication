package com.cyient.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverWrapper {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
