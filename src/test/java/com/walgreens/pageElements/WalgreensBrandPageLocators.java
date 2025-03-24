package com.walgreens.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WalgreensBrandPageLocators {
	@FindBy(xpath="//h1[text()='Mats']")
	public WebElement verifyItem;
	@FindBy(xpath="//input[@title='GoFit']")
	public WebElement chkBxLink;
}
