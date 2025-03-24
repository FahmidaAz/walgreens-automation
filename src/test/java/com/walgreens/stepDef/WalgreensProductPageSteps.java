package com.walgreens.stepDef;

import org.openqa.selenium.WebDriver;

import com.walgreens.pageActions.WalgreensProductPageActions;

import cucumber.api.java.en.*;
import walgreens.utilities.SetupDrivers;

public class WalgreensProductPageSteps {
	
	WebDriver driver = SetupDrivers.getDriver();
	WalgreensProductPageActions WalgreensProductPageActionsObj = new WalgreensProductPageActions(driver);
	
	@When("^User adds the product to the cart$")
	public void user_adds_the_product_to_the_cart() throws Throwable {
		WalgreensProductPageActionsObj.clickAddToCart();
	}
	
	@When("^User selects \"([^\"]*)\" from the popup$")
	public void user_selects_from_the_popup(String arg1) throws Throwable {
		WalgreensProductPageActionsObj.clickShippingMethod();
	}

	@When("^User clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String arg1) throws Throwable {
		WalgreensProductPageActionsObj.clickViewCart();
	}

}
