package com.walgreens.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//Fahmida
public class WalgreensHomePageLocators {
    //shop dropdown link
	@FindBy(xpath="//a[@data-reactid='393']")
	public WebElement shopLink;
	
	@FindBy(xpath="//a[@class='mega-dropdown__title']//span[contains(text(),'Vitamins & Supplements')]")
	public WebElement vitaminsOption;
	
	@FindBy(xpath="//a[@role='button']//span[contains(text(),'Multivitamins')]")
	public WebElement multivitamins;
	
	@FindBy(xpath="//li[@id='mega-dropdown__11-1-0__361617-tier3']//span[1]")
	public WebElement womenMultivitamin;
	
}
