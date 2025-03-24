package com.walgreens.stepDef;

import com.walgreens.pageActions.WalgreensVerifyBrandPageActions;

import cucumber.api.java.en.Then;

public class WalgreensVerifyBrandName {
	WalgreensVerifyBrandPageActions WalgreensVerifyBrandPageActionsObj = new WalgreensVerifyBrandPageActions();

	@Then("^the product list should be filtered to show only \"([^\"]*)\" mats$")
	public void the_product_list_should_be_filtered_to_show_only_mats(String arg1) throws Throwable {
		WalgreensVerifyBrandPageActionsObj.verifyBrandName();
	}

}
