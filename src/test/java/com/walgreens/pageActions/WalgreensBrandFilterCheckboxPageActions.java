package com.walgreens.pageActions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.walgreens.pageElements.WalgreensBrandPageLocators;

import walgreens.utilities.SetupDrivers;

public class WalgreensBrandFilterCheckboxPageActions {
	WebDriverWait wait = new WebDriverWait(SetupDrivers.driver, 10);
	WalgreensBrandPageLocators WalgreensBrandPageLocatorsObj;

	public WalgreensBrandFilterCheckboxPageActions() {
		WalgreensBrandPageLocatorsObj = new WalgreensBrandPageLocators();
		PageFactory.initElements(SetupDrivers.driver, WalgreensBrandPageLocatorsObj);
	}
   public void verifyItemAppears(){
	   WalgreensBrandPageLocatorsObj.verifyItem.isDisplayed(); 
   }
   public void scrollDownToBrand(){
	   JavascriptExecutor js = (JavascriptExecutor)SetupDrivers.driver;
	   js.executeScript("window.scrollBy(0,500);");
   }
	public void clickChkBox(){
		 WalgreensBrandPageLocatorsObj.chkBxLink.click();	
	}

}
