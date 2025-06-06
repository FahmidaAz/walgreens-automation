package com.walgreens.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Fahmida
public class WalgreensHomePageLocators {
	// search functionality
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement searchBox;
	@FindBy(xpath = "//button[@aria-label='Search']//*[name()='svg']")
	public WebElement searchBtn;

	// checkbox functionality
	@FindBy(xpath = "//a[@aria-label='Walgreens Home']")
	public WebElement logoLink;
	@FindBy(xpath = "//a[@data-element-name='Shop']")
	public WebElement shopLink;
	@FindBy(xpath = "//a[@data-element-name='Fitness & Nutrition']")
	public WebElement FitnessLink;
	@FindBy(xpath = "//a[@data-element-name='Yoga & Pilates']")
	public WebElement yogaLink;
	@FindBy(xpath = "//a[@data-element-name='Mats']")
	public WebElement matsLink;

	// Shop now button locator
	@FindBy(xpath = "//div[@id='pickup-sitewide-tile-1']//a[contains(@role,'button')]")
	public WebElement shopNowBtn;

	// Search text box
	@FindBy(xpath = "//input[@aria-label = 'Search by keyword or item number']")
	public WebElement searchTextBox;

	// Search button
	@FindBy(xpath = "//button[@aria-label = 'Search']")
	public WebElement searchButton;

}
