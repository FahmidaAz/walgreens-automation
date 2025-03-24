package com.walgreens.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WalgreensYourAccountPageLocators {
	
	//Your Account Text
	@FindBy(xpath = "//h1[contains(text(),'Your Account')]")
	public WebElement yourAccount;

}
