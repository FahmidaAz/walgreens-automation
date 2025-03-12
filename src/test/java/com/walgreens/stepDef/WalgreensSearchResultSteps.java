package com.walgreens.stepDef;

import com.walgreens.pageActions.WalgreensSearchResultActions;

import cucumber.api.java.en.Then;

public class WalgreensSearchResultSteps {
	WalgreensSearchResultActions WalgreensSearchResultActionsObj = new WalgreensSearchResultActions();
	@Then("^I should see a list of products related to \"([^\"]*)\"$")
	public void i_should_see_a_list_of_products_related_to(String arg1) throws Throwable {
		WalgreensSearchResultActionsObj.verifyItem();
	}
}
