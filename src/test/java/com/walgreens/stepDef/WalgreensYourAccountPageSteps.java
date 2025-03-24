package com.walgreens.stepDef;

import com.walgreens.pageActions.WalgreensYourAccountPageActions;

import cucumber.api.java.en.Then;

public class WalgreensYourAccountPageSteps {
	
	WalgreensYourAccountPageActions WalgreensYourAccountPageActionsObj = new WalgreensYourAccountPageActions();
	
	
	@Then("^Users should redirect to Your Account page$")
	public void users_should_redirect_to_Your_Account_page() throws Throwable {
		WalgreensYourAccountPageActionsObj.verifyYourAccount();
	}

}
