package com.walgreens.pageActions;

import org.openqa.selenium.support.PageFactory;

import com.walgreens.pageElements.WalgreensSearchResultLocators;

import walgreens.utilities.SetupDrivers;

public class WalgreensSearchResultActions {
	WalgreensSearchResultLocators WalgreensSearchResultLocatorsObj;
	public WalgreensSearchResultActions(){
		WalgreensSearchResultLocatorsObj = new WalgreensSearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, WalgreensSearchResultLocatorsObj);
	}
	public void verifyItem() throws InterruptedException{
		Thread.sleep(5000);
		WalgreensSearchResultLocatorsObj.searchResult.isDisplayed();
	}
	public void verifyExcelItem() throws InterruptedException{
		Thread.sleep(5000);
		WalgreensSearchResultLocatorsObj.excelItem.isDisplayed();
	}
}
