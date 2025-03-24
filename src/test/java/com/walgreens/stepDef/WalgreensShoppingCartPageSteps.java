package com.walgreens.stepDef;

import org.openqa.selenium.WebDriver;

import com.walgreens.pageActions.WalgreensShoppingCartActions;

import cucumber.api.java.en.Then;
import walgreens.utilities.SetupDrivers;

public class WalgreensShoppingCartPageSteps {
	
	WebDriver driver = SetupDrivers.getDriver();
	WalgreensShoppingCartActions WalgreensShoppingCartActionsObj = new WalgreensShoppingCartActions(driver);
	
	@Then("^The product should be displayed in the shopping cart$")
	public void the_product_should_be_displayed_in_the_shopping_cart() throws Throwable {
		WalgreensShoppingCartActionsObj.verifyCartText();
	   
	}

}
