package com.walgreens.pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.walgreens.pageElements.WalgreensYourAccountPageLocators;

import walgreens.utilities.SetupDrivers;

public class WalgreensYourAccountPageActions {
	
	WalgreensYourAccountPageLocators WalgreensYourAccountPageLocatorsObj;
	
	public WalgreensYourAccountPageActions(){
		
		WalgreensYourAccountPageLocatorsObj = new WalgreensYourAccountPageLocators();
		PageFactory.initElements(SetupDrivers.driver, WalgreensYourAccountPageLocatorsObj);
	}
	
	public void verifyYourAccount() throws Exception {
        Assert.assertTrue(WalgreensYourAccountPageLocatorsObj.yourAccount.isDisplayed());
        Thread.sleep(5000);
    }

}
