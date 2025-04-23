package com.walgreens.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WalgreensBBCreamPageLocators {
     @FindBy(xpath="//li[@id='filter_list_1_desktop']//span[@class='title-small'][normalize-space()='Aspirin']")
     public WebElement verifyBBProduct;
}
