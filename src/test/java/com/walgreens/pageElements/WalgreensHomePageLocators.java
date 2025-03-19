package com.walgreens.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WalgreensHomePageLocators {
	
	WebDriver driver;

    // Constructor that accepts WebDriver
    public WalgreensHomePageLocators(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

	// Search text box
	@FindBy(xpath = "//input[@aria-label = 'Search by keyword or item number']")
	public WebElement searchTextBox;


	// Search button
	@FindBy(xpath = "//button[@aria-label = 'Search']")
	public WebElement searchButton;

}
