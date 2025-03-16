package com.walgreens.stepDef;

import com.walgreens.pageActions.WalgreensShopNowPageActions;

import cucumber.api.java.en.When;

public class WalgreensShopNowPageSteps {
	WalgreensShopNowPageActions WalgreensShopNowPageActionsObj = new WalgreensShopNowPageActions();
	@When("^From shop page select \"([^\"]*)\" checkbox$")
	public void from_shop_page_select_checkbox(String arg1) throws Throwable {
		Thread.sleep(5000);
		WalgreensShopNowPageActionsObj.clickBBChkBx();
	}
}
