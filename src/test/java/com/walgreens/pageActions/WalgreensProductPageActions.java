package com.walgreens.pageActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.walgreens.pageElements.WalgreensProductPageLocators;

public class WalgreensProductPageActions {
	
	WalgreensProductPageLocators WalgreensProductPageLocatorsObj;
	WebDriver driver;
	WebDriverWait wait;
	
	public WalgreensProductPageActions(WebDriver driver){
		this.driver = driver;
		this.wait = new WebDriverWait(driver,10);
		this.WalgreensProductPageLocatorsObj = new WalgreensProductPageLocators(driver);
		
	}
	
	public void verifyProductPage() throws Exception{
		Assert.assertTrue(WalgreensProductPageLocatorsObj.vitamins.isDisplayed());
		Thread.sleep(5000);
		
	}
	
	public void clickAddToCart() throws Exception{
		WalgreensProductPageLocatorsObj.addtocartbutton.click();
		Thread.sleep(4000);
	}
	
	public void clickShippingMethod(){
		
		WebDriverWait wait = new WebDriverWait(driver,10);  // Explicit wait
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Shipping']"))).click();
	}
	
	public void clickViewCart(){
		WebDriverWait wait = new WebDriverWait(driver,10);  // Explicit wait
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text() ='View cart']"))).click();
		
	}

}
