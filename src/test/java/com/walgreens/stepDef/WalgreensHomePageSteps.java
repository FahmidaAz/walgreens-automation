package com.walgreens.stepDef;

import org.openqa.selenium.WebDriver;

import com.walgreens.pageActions.WalgreensHomePageActions;

import cucumber.api.java.en.*;
import walgreens.utilities.SetupDrivers;

public class WalgreensHomePageSteps {
	
	WebDriver driver = SetupDrivers.getDriver();
	WalgreensHomePageActions WalgreensHomePageActionsObj = new WalgreensHomePageActions(driver);
	
	@Given("^User is on the Walgreens home page$")
	public void user_is_on_the_Walgreens_home_page() throws Throwable {
	   
	}

	@When("^User searches for \"([^\"]*)\"$")
	public void user_searches_for(String productName) throws Throwable {
		WalgreensHomePageActionsObj.searchProduct(productName);
	}
	
	@When("^User clicks the search button$")
	public void user_clicks_the_search_button() throws Throwable {
		WalgreensHomePageActionsObj.clickSearchButton();
	    
	}

}
