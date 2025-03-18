package com.walgreens.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WalgreensSearchResultLocators {
       @FindBy(xpath="//h1[text()='Sunscreen']")
       public WebElement searchResult;
       
       @FindBy(xpath="//h1[@class='title-xx-large semi-bold']")
       public WebElement excelItem;
}
