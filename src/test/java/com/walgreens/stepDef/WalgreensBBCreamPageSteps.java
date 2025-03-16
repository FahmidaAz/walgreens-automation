package com.walgreens.stepDef;

import com.walgreens.pageActions.WalgreensBBCreamPageActions;

import cucumber.api.java.en.Then;

public class WalgreensBBCreamPageSteps {
	WalgreensBBCreamPageActions WalgreensBBCreamPageActionsObj = new WalgreensBBCreamPageActions();
	@Then("^\"([^\"]*)\" related product will be showed$")
	public void related_product_will_be_showed(String arg1) throws Throwable {
		Thread.sleep(5000);
		WalgreensBBCreamPageActionsObj.verifyBBItem();
	}
}
