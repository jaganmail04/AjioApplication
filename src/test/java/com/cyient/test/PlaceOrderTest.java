package com.cyient.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.PlaceOrderPage;

public class PlaceOrderTest extends WebDriverWrapper {
	@Test
	public void orderDetails() throws InterruptedException
	{
		PlaceOrderPage orderPage = new PlaceOrderPage(driver);
		String parentWindow=driver.getWindowHandle();
		WebElement KidsLocator = driver.findElement(By.xpath("//*[text()='KIDS']"));
		Actions act = new Actions(driver);
		act.moveToElement(KidsLocator).perform();
//		Thread.sleep(1000);
		orderPage.kidsTab();
		orderPage.denims();
		orderPage.clickFirstItem();
		Set<String> allwindows = driver.getWindowHandles();
		for(String childWindow:allwindows)
		{
			if(!parentWindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				orderPage.selectColor();

				orderPage.selectSize();
				orderPage.selectAddToBag();
				orderPage.proceedAddToBag();
				orderPage.selectDelete();	
				orderPage.clickDelete();
				Assert.assertEquals(orderPage.errMessage(), "Your Shopping Bag is Empty!!");
			}
	}
}
}
