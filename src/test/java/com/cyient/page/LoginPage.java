package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	
	private By signinLocator = By.xpath("//*[text()='Sign In / Join AJIO']");
	private By continueButton = By.xpath("//input[@value='Continue']");
	private By errorMessageLocator = By.id("error-msg");
	private By termsLocator = By.xpath("(//*[contains(text(),'Terms')])[1]");
	
	private WebDriver driver;
	public LoginPage(WebDriver driver) {
	this.driver=driver;
}
	
	public void clickSignin() {
		driver.findElement(signinLocator).click();
	}
//
//	public void sendPass(String pass) {
//		driver.findElement(passLocator).sendKeys(pass);
//			}
//	public void selectLanguageByText(String language) {
//		Select selectlanguage=new Select(driver.findElement(languageLocator));
//		selectlanguage.selectByVisibleText(language);
//	}
	
	public void clickContine() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(continueButton).click();
	}
	
	public String invalidText(){
		return driver.findElement(errorMessageLocator).getText();
	}
	
	public void clickTerms() {
		driver.findElement(termsLocator).click();
		
	}
		
	 
		
				
	

}
