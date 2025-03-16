package com.walgreens.stepDef;

import com.walgreens.pageActions.WalgreensVerifyBrandPageActions;

import cucumber.api.java.en.Then;

public class WalgreensVerifyBrandName {
	WalgreensVerifyBrandPageActions WalgreensVerifyBrandPageActionsObj = new WalgreensVerifyBrandPageActions();

	@Then("^\"([^\"]*)\" related product will showed up$")
	public void related_product_will_showed_up(String arg1) throws Throwable {
		WalgreensVerifyBrandPageActionsObj.verifyBrand();
	}
}
