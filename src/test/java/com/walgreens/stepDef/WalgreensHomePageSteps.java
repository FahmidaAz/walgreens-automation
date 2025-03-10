package com.walgreens.stepDef;

import com.walgreens.pageActions.WalgreensHomePageActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
//Fahmida
public class WalgreensHomePageSteps {
	WalgreensHomePageActions WalgreensHomePageActionsObj = new WalgreensHomePageActions();
	@Given("^Open Walgreens Homepage$")
	public void open_Walgreens_Homepage() throws Throwable {
	   
	}

	@When("^Click on \"([^\"]*)\" dropdown$")
	public void click_on_dropdown(String arg1) throws Throwable {
		WalgreensHomePageActionsObj.clickOnShop();
	}

	@When("^Select and click on \"([^\"]*)\"$")
	public void select_and_click_on(String arg1) throws Throwable {
		WalgreensHomePageActionsObj.clickOnVitamin();
		WalgreensHomePageActionsObj.clickOnMultivitamin();
		WalgreensHomePageActionsObj.clickOnWomenMultivitamin();
	}

}
