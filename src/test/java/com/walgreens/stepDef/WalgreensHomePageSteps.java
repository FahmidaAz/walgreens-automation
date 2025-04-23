package com.walgreens.stepDef;


import com.walgreens.pageActions.WalgreensHomePageActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

//Fahmida
public class WalgreensHomePageSteps {
	WalgreensHomePageActions WalgreensHomePageActionsObj = new WalgreensHomePageActions();

	// search functionality
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

	// checkbox functionality
	@Given("^the user is on the Walgreens homepage$")
	public void the_user_is_on_the_Walgreens_homepage() throws Throwable {
		WalgreensHomePageActionsObj.verifyHomepage();
	}

	@When("^the user hovers over the \"([^\"]*)\" dropdown$")
	public void the_user_hovers_over_the_dropdown(String arg1) throws Throwable {
		WalgreensHomePageActionsObj.clickShopLink(); 
	}

	@When("^the user clicks on \"([^\"]*)\" from the dropdown$")
	public void the_user_clicks_on_from_the_dropdown(String arg1) throws Throwable {
		WalgreensHomePageActionsObj.clickFitnessLink(); 
	}

	@When("^the user clicks on \"([^\"]*)\" from the subcategory dropdown$")
	public void the_user_clicks_on_from_the_subcategory_dropdown(String arg1) throws Throwable {
		WalgreensHomePageActionsObj.clickYogaLink();
	}

	@When("^the user clicks on \"([^\"]*)\" from the filtered category$")
	public void the_user_clicks_on_from_the_filtered_category(String arg1) throws Throwable {
		Thread.sleep(5000);
		WalgreensHomePageActionsObj.clickMatLink();
	}
	
	//Shop now checkbox functionality
	@When("^Click on \"([^\"]*)\" button$")
	public void click_on_button(String arg1) throws Throwable {
		Thread.sleep(5000);
		WalgreensHomePageActionsObj.clickShopBtn(); 
	}
	
	//Search from excel file
	@When("^the user enters the item from Excel in the search box$")
	public void the_user_enters_the_item_from_Excel_in_the_search_box() throws Throwable {
		Thread.sleep(5000);
		WalgreensHomePageActionsObj.searchExcel();
	}

	@When("^the user clicks the search button$")
	public void the_user_clicks_the_search_button() throws Throwable {
		WalgreensHomePageActionsObj.searchBtn();
	}	
	
	
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
	
	@Given("^Open Walgreens Homepage$")
	public void open_Walgreens_Homepage() throws Throwable {
	  
	}
	
	
	

}
