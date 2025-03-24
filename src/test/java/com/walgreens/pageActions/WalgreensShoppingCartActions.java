package com.walgreens.pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.walgreens.pageElements.WalgreensProductPageLocators;
import com.walgreens.pageElements.WalgreensShoppingCartLocators;

import junit.framework.Assert;

public class WalgreensShoppingCartActions {
	
	WalgreensShoppingCartLocators WalgreensShoppingCartLocatorsObj;
	WebDriver driver;
	WebDriverWait wait;
	
	public WalgreensShoppingCartActions(WebDriver driver){
		this.WalgreensShoppingCartLocatorsObj = new WalgreensShoppingCartLocators(driver);
		this.wait = new WebDriverWait(driver,10);
	}
	
	public void verifyCartText() throws Exception{
		Assert.assertTrue(WalgreensShoppingCartLocatorsObj.shoppingCart.isDisplayed());
        Thread.sleep(5000);
		
	}
	

}
