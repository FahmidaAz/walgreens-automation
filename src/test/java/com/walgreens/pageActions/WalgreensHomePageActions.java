package com.walgreens.pageActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.walgreens.pageElements.WalgreensHomePageLocators;

import walgreens.utilities.SetupDrivers;

public class WalgreensHomePageActions {
	WalgreensHomePageLocators WalgreensHomePageLocatorsObj;

	public WalgreensHomePageActions() {
		WalgreensHomePageLocatorsObj = new WalgreensHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, WalgreensHomePageLocatorsObj);
	}

	// search functionality
	public void searchItem() {
		WalgreensHomePageLocatorsObj.searchBox.sendKeys("Sunscreen");

	}

	public void searchBtn() throws InterruptedException {
		Thread.sleep(5000);
		WalgreensHomePageLocatorsObj.searchBtn.click();
	}
//checkBox functionality
	public void verifyHomepage(){
		WalgreensHomePageLocatorsObj.logoLink.isDisplayed();
	}
	public void clickShopLink() throws InterruptedException{
		Thread.sleep(5000);
		WalgreensHomePageLocatorsObj.shopLink.click();
	}
	public void clickFitnessLink() throws InterruptedException{
		Thread.sleep(5000);
		WalgreensHomePageLocatorsObj.FitnessLink.click();
	}
	public void clickYogaLink() throws InterruptedException{
		Thread.sleep(5000);
		WalgreensHomePageLocatorsObj.yogaLink.click();
	}
	public void clickMatLink() throws InterruptedException{
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)SetupDrivers.driver;
		js.executeScript("arguments[0].click();",WalgreensHomePageLocatorsObj.matsLink );
	}
	
	
	//click on shopNow button
	public void clickShopBtn(){
		WalgreensHomePageLocatorsObj.shopNowBtn.click();
	}

}
