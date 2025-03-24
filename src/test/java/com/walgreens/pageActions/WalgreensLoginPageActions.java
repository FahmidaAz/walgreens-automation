package com.walgreens.pageActions;

import org.openqa.selenium.support.PageFactory;

import com.walgreens.pageElements.WalgreensLoginPageLocators;

import walgreens.utilities.SetupDrivers;

public class WalgreensLoginPageActions {
	
	WalgreensLoginPageLocators WalgreensLoginPageLocatorsObj;
	
	public WalgreensLoginPageActions(){
		
		WalgreensLoginPageLocatorsObj = new WalgreensLoginPageLocators();
		PageFactory.initElements(SetupDrivers.driver, WalgreensLoginPageLocatorsObj);
		
	}
	
	public void enterEmail(String emailAdd){
		WalgreensLoginPageLocatorsObj.email.sendKeys(emailAdd);
		
	}
	
	public void enterPassword(String pwd){
		WalgreensLoginPageLocatorsObj.password.sendKeys(pwd);
		
	}
	
	public void clickSigninButton(){
		WalgreensLoginPageLocatorsObj.signinbtn.click();
		
	}
	
	
	
	
	

}
