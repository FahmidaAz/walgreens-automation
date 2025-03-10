package com.walgreens.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WalgreensVerifyBrandPageLocators {
     @FindBy(xpath="//h1[@class='title-xx-large semi-bold title_divider']")
     public WebElement verifyBrand;
}
