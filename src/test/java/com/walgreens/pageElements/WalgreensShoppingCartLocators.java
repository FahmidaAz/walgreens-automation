package com.walgreens.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WalgreensShoppingCartLocators {
	
	WebDriver driver;

    // Constructor that accepts WebDriver
    public WalgreensShoppingCartLocators(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	
	// shoppingCart text
		@FindBy(xpath = "//h1[@id ='wag-cart-shopping-lbl']")
		public WebElement shoppingCart;

}
