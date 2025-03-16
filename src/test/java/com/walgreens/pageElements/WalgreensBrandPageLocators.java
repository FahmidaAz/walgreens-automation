package com.walgreens.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WalgreensBrandPageLocators {
	@FindBy(xpath = "//input[@title='Walgreens']")
	public WebElement brandCheckbox;
	//public static String brandCheckbox = "//input[@title='Walgreens']";

}
