package com.walgreens.pageActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.walgreens.pageElements.WalgreensHomePageLocators;

import walgreens.utilities.SetupDrivers;

public class WalgreensHomePageActions {
	WalgreensHomePageLocators WalgreensHomePageLocatorsObj;
	public WalgreensHomePageActions(){
		WalgreensHomePageLocatorsObj = new WalgreensHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, WalgreensHomePageLocatorsObj);
	}
	//search functionality
	public void searchItem(){
		
	}
	public void searchBtn(){
		
	}
	//click on shop navbar link
	public void clickOnShop(){
		WalgreensHomePageLocatorsObj.shopLink.click();	
	}
	//click on vitamin and suppliments
	public void clickOnVitamin(){
		WalgreensHomePageLocatorsObj.vitaminsOption.click();
	}
	//click on multivitamin
	public void clickOnMultivitamin(){
		WalgreensHomePageLocatorsObj.multivitamins.click();
	}
	//click on womens multivitamin
	public void clickOnWomenMultivitamin(){
		WalgreensHomePageLocatorsObj.womenMultivitamin.click();
	}
	
}
