package com.walgreens.pageActions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.walgreens.pageElements.WalgreensBrandPageLocators;

import walgreens.utilities.SetupDrivers;

public class WalgreensBrandFilterCheckboxPageActions {
	WebDriverWait wait = new WebDriverWait(SetupDrivers.driver, 10);
	WalgreensBrandPageLocators WalgreensBrandPageLocatorsObj;

	public WalgreensBrandFilterCheckboxPageActions() {
		WalgreensBrandPageLocatorsObj = new WalgreensBrandPageLocators();
		PageFactory.initElements(SetupDrivers.driver, WalgreensBrandPageLocatorsObj);
	}

	public void filterWalgreeenBrand() throws InterruptedException {

		WebElement element = wait.until(ExpectedConditions.visibilityOf(WalgreensBrandPageLocatorsObj.brandCheckbox));

		JavascriptExecutor js = (JavascriptExecutor) SetupDrivers.driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", element);

	}

}
