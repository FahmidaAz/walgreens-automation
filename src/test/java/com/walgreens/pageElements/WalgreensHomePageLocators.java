package com.walgreens.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Fahmida
public class WalgreensHomePageLocators {
	// search functionality
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement searchBox;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement searchBtn;
	// shop dropdown link
	@FindBy(xpath = "//li[@id='menu-shop-products']//a")
	public WebElement shopLink;

	@FindBy(xpath = "//li[@id='mega-dropdown__12__359441-tier1']/a")
	public WebElement vitaminsOption;

	@FindBy(xpath = "//li[@id='mega-dropdown__12-1__360567-tier2general']/a")
	public WebElement multivitamins;

	@FindBy(xpath = "//li[@id='mega-dropdown__12-1-0__361617-tier3']/a")
	public WebElement womenMultivitamin;

	//Shop now button locator
	@FindBy(xpath="//span[@aria-describedby='beauty-tile-1-header']")
	public WebElement shopNowBtn;
}
