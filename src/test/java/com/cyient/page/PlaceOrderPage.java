package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.cyient.base.WebDriverWrapper;

public class PlaceOrderPage extends WebDriverWrapper {
//	private By kidsLocator = By.xpath("//*[text()='KIDS']");
	private By denimsLocator = By.xpath("//*[text()='Denims Under 799']");
	private By firstItem = By.xpath("//div[contains(@style,'left: 0px; position: absolute; top: 0px;')]");
	private By colourLocator = By.xpath("//*[@title='medium-blue']");
	private By sizeLocator = By.xpath("(//div[@data-index='0'])[3]");
	private By cartLocator = By.xpath("//*[text()='ADD TO BAG']");
	private By continueCartLocator = By.xpath("//a[@href='/cart']");
	private By deleteButton = By.xpath("//*[text()='Delete']");
	private By confirmDeleteButton = By.xpath("//*[text()='DELETE']");
	private By emptyBagLocator = By.xpath("//*[text()='Your Shopping Bag is Empty!!']");
	private WebDriver driver;
	public PlaceOrderPage(WebDriver driver) {
	this.driver=driver;
}
	public void kidsTab() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[text()='KIDS']"))).perform();
	}
	
	public void denims() {
		driver.findElement(denimsLocator).click();
		
	}
	
	public void clickFirstItem() {
		driver.findElement(firstItem).click();
		
	}
	
	public void selectColor() {
		driver.findElement(colourLocator).click();
		
	}
	
	public void selectSize() {
		driver.findElement(sizeLocator).click();
	}
	
	public void selectAddToBag() throws InterruptedException {
		driver.findElement(cartLocator).click();
		Thread.sleep(5000);
	}
	
	public void proceedAddToBag() throws InterruptedException {
		driver.findElement(continueCartLocator).click();
		Thread.sleep(5000);
	}
	
	public void selectDelete() throws InterruptedException {
		driver.findElement(deleteButton).click();
		Thread.sleep(2000);
	}
	
	public void clickDelete() throws InterruptedException {
		driver.findElement(confirmDeleteButton).click();
		Thread.sleep(2000);
	}
	
	public String errMessage() {
		
		String errorMessage = driver.findElement(emptyBagLocator).getText();
		return errorMessage;
	}
	
	
	
	
	

}
