package com.walgreens.pageActions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.walgreens.pageElements.WalgreensHomePageLocators;

import walgreens.utilities.SetupDrivers;

public class WalgreensHomePageActions {
	
	WalgreensHomePageLocators WalgreensHomePageLocatorsObj;
	SetupDrivers driver;
	
	
	public WalgreensHomePageActions(WebDriver driver){
		
		SetupDrivers.driver = driver;
        WalgreensHomePageLocatorsObj = new WalgreensHomePageLocators(driver);
        
	}
	
	public void searchProduct(String productName) throws Exception{
		WalgreensHomePageLocatorsObj.searchTextBox.sendKeys(productName);
		
		
	}
	
	public void clickSearchButton() throws Exception{
		WalgreensHomePageLocatorsObj.searchButton.click();
		Thread.sleep(4000);
	}
	

}
