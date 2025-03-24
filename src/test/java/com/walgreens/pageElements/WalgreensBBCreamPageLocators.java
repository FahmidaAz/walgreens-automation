package com.walgreens.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WalgreensBBCreamPageLocators {
     @FindBy(xpath="//span[text()='BB Cream']")
     public WebElement verifyBBProduct;
}
