package com.walgreens.pageActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.walgreens.pageElements.WalgreensHomePageLocators;
import walgreens.utilities.ReadExcelSheets;
import walgreens.utilities.SetupDrivers;

public class WalgreensHomePageActions {

	WalgreensHomePageLocators WalgreensHomePageLocatorsObj;


	public WalgreensHomePageActions() {
		WalgreensHomePageLocatorsObj = new WalgreensHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, WalgreensHomePageLocatorsObj);

	}

	// search functionality
	public void searchItem() throws Exception {
		WalgreensHomePageLocatorsObj.searchBox.sendKeys(Keys.CLEAR);
		WalgreensHomePageLocatorsObj.searchBox.sendKeys("Sunscreen");

	}
	public void searchBtn() throws InterruptedException {
		Thread.sleep(5000);
		WalgreensHomePageLocatorsObj.searchBtn.click();
	}
	//checkBox functionality
	public void verifyHomepage(){
		WalgreensHomePageLocatorsObj.logoLink.isDisplayed();
	}
	public void clickShopLink() throws InterruptedException{
		Thread.sleep(5000);
		WalgreensHomePageLocatorsObj.shopLink.click();
	}
	public void clickFitnessLink() throws InterruptedException{
		Thread.sleep(5000);
		WalgreensHomePageLocatorsObj.FitnessLink.click();
	}
	public void clickYogaLink() throws InterruptedException{
		Thread.sleep(5000);
		WalgreensHomePageLocatorsObj.yogaLink.click();
	}
	public void clickMatLink() throws InterruptedException{
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)SetupDrivers.driver;
		js.executeScript("arguments[0].click();",WalgreensHomePageLocatorsObj.matsLink );
	}


	//click on shopNow button
	public void clickShopBtn(){
		WalgreensHomePageLocatorsObj.shopNowBtn.click();
	}

	//search from excel file
	public void searchExcel() throws Exception{
		JavascriptExecutor js = (JavascriptExecutor) SetupDrivers.driver;

		// Clear the search box
		js.executeScript("arguments[0].value = '';", WalgreensHomePageLocatorsObj.searchBox);

		// Retrieve the item from Excel
		String item = ReadExcelSheets.getMapData("Item");

		// Set the new value in the search box
		js.executeScript("arguments[0].value = arguments[1];", WalgreensHomePageLocatorsObj.searchBox, item);

		// Trigger input event to simulate typing behavior
		js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", WalgreensHomePageLocatorsObj.searchBox);

		// Introduce a small wait to allow dropdown suggestions to appear
		Thread.sleep(2000);

		// Option 1: Simulate pressing Enter key to trigger search
		WalgreensHomePageLocatorsObj.searchBox.sendKeys(Keys.ENTER);
	}

	/*public void searchProduct(String productName) throws Exception{
		WalgreensHomePageLocatorsObj.searchTextBox.sendKeys(productName);
		
				SetupDrivers driver;

		public WalgreensHomePageActions(WebDriver driver){

			SetupDrivers.driver = driver;
			WalgreensHomePageLocatorsObj = new WalgreensHomePageLocators(driver);
		}*/
		public void searchProduct(String productName) throws Exception{
			WalgreensHomePageLocatorsObj.searchTextBox.sendKeys(productName);

		}
		public void clickSearchButton() throws Exception{
			WalgreensHomePageLocatorsObj.searchButton.click();
			Thread.sleep(4000);
		}


	}
