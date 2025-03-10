package com.walgreens.pageActions;

import org.openqa.selenium.support.PageFactory;

import com.walgreens.pageElements.WalgreensBrandPageLocators;

import walgreens.utilities.SetupDrivers;

public class WalgreensBrandFilterCheckboxPageActions {
	WalgreensBrandPageLocators WalgreensBrandPageLocatorsObj;
	
	public WalgreensBrandFilterCheckboxPageActions(){
		WalgreensBrandPageLocatorsObj = new WalgreensBrandPageLocators();
		PageFactory.initElements(SetupDrivers.driver, WalgreensBrandPageLocatorsObj);
	}
	
	public void filterWalgreeenBrand() throws InterruptedException{
		Thread.sleep(2000);
		WalgreensBrandPageLocatorsObj.brandCheckbox.click();
	}
}
