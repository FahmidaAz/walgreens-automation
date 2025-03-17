package com.walgreens.stepDef;

import com.walgreens.pageActions.WalgreensBrandFilterCheckboxPageActions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WalgreensBrandCheckboxPageSteps {
	WalgreensBrandFilterCheckboxPageActions WalgreensBrandFilterCheckboxPageActionsObj = new WalgreensBrandFilterCheckboxPageActions();

	@Then("^the \"([^\"]*)\" category page should be displayed$")
	public void the_category_page_should_be_displayed(String arg1) throws Throwable {
		WalgreensBrandFilterCheckboxPageActionsObj.verifyItemAppears();
	}

	@When("^the user expands the \"([^\"]*)\" filter$")
	public void the_user_expands_the_filter(String arg1) throws Throwable {
		Thread.sleep(5000);
		WalgreensBrandFilterCheckboxPageActionsObj.scrollDownToBrand();
	}

	@When("^the user clicks on the \"([^\"]*)\" brand$")
	public void the_user_clicks_on_the_brand(String arg1) throws Throwable {
		Thread.sleep(5000);
		WalgreensBrandFilterCheckboxPageActionsObj.clickChkBox();
	}
}
