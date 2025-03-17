package com.walgreens.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WalgreensVerifyBrandPageLocators {
	@FindBy(xpath="//h1[text()='GoFit - Mats']")
	public WebElement verifyBrand;
}
