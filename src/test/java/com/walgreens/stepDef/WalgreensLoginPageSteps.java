package com.walgreens.stepDef;

import com.walgreens.pageActions.WalgreensLoginPageActions;

import cucumber.api.java.en.*;

public class WalgreensLoginPageSteps {
	
	WalgreensLoginPageActions WalgreensLoginPageActionsObj = new WalgreensLoginPageActions();
	
	@Given("^Users is in the login page$")
	public void users_is_in_the_login_page() throws Throwable {
	    
	}

	@When("^Users logged in with valid credential \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void users_logged_in_with_valid_credential_and_Password(String emailAdd, String pwd) throws Throwable {
		WalgreensLoginPageActionsObj.enterEmail(emailAdd);
		WalgreensLoginPageActionsObj.enterPassword(pwd);
	}

	@When("^Users click on Sign in button$")
	public void users_click_on_Sign_in_button() throws Throwable {
		WalgreensLoginPageActionsObj.clickSigninButton();
		Thread.sleep(5000);
	}
	
	
	


}
