package com.walgreens.pageActions;

import org.openqa.selenium.support.PageFactory;

import com.walgreens.pageElements.WalgreensBBCreamPageLocators;

import walgreens.utilities.SetupDrivers;

public class WalgreensBBCreamPageActions {
	WalgreensBBCreamPageLocators WalgreensBBCreamPageLocatorsObj;
	public WalgreensBBCreamPageActions(){
		WalgreensBBCreamPageLocatorsObj = new WalgreensBBCreamPageLocators();
		PageFactory.initElements(SetupDrivers.driver, WalgreensBBCreamPageLocatorsObj);
	}
	public void verifyBBItem(){
		WalgreensBBCreamPageLocatorsObj.verifyBBProduct.isDisplayed();
	}
}
