package com.walgreens.pageActions;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.walgreens.pageElements.WalgreensVerifyBrandPageLocators;

import walgreens.utilities.SetupDrivers;

public class WalgreensVerifyBrandPageActions {
	WalgreensVerifyBrandPageLocators WalgreensVerifyBrandPageLocatorsObj;
	public WalgreensVerifyBrandPageActions(){
		WalgreensVerifyBrandPageLocatorsObj = new WalgreensVerifyBrandPageLocators();
		PageFactory.initElements(SetupDrivers.driver, WalgreensVerifyBrandPageLocatorsObj);
	}
	
	public void verifyBrand(){
		Assert.assertTrue(WalgreensVerifyBrandPageLocatorsObj.verifyBrand.isDisplayed());
	}
}
