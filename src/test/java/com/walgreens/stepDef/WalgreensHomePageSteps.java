package com.walgreens.stepDef;

import com.walgreens.pageActions.WalgreensHomePageActions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
//Fahmida
public class WalgreensHomePageSteps {
	WalgreensHomePageActions WalgreensHomePageActionsObj = new WalgreensHomePageActions();
	//search functionality
	@Given("^I am on the Walgreens homepage$")
	public void i_am_on_the_Walgreens_homepage() throws Throwable {
		
	}

	@When("^I enter \"([^\"]*)\" in the search box$")
	public void i_enter_in_the_search_box(String arg1) throws Throwable {
		WalgreensHomePageActionsObj.searchItem();
	}

	@When("^I click the search button$")
	public void i_click_the_search_button() throws Throwable {
		WalgreensHomePageActionsObj.searchBtn();
	}
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
