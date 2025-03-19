package com.walgreens.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WalgreensProductPageLocators {
	
	WebDriver driver;

    // Constructor that accepts WebDriver
    public WalgreensProductPageLocators(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


	// product page text vitamins
	@FindBy(xpath = "//h1[contains(text(),vitamins)]")
	public WebElement vitamins;

	// add to cart button
	@FindBy(xpath = "//button[@id = 'pickup-ship-btncompare_400647561']")
	public WebElement addtocartbutton;

	// shipping method
	@FindBy(xpath = "//h3[text()='Shipping'] ")
	public WebElement shipping;

	// view cart button 
	@FindBy(xpath = "//span[text() ='View cart']")
	public WebElement viewcart;

}
