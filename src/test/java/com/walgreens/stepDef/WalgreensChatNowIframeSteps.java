package com.walgreens.stepDef;

import com.walgreens.pageActions.WalgreensChatNowIframeActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WalgreensChatNowIframeSteps {
	WalgreensChatNowIframeActions WalgreensChatNowIframeActionsObj = new WalgreensChatNowIframeActions();
	
	@Given("^User is on the Walgreens login page$")
	public void user_is_on_the_Walgreens_login_page() throws Throwable {
		WalgreensChatNowIframeActionsObj.loadPage();
		Thread.sleep(5000);
	}
	
	@When("^User click on Chat Now  link$")
	public void user_click_on_Chat_Now_link() throws Throwable {
		WalgreensChatNowIframeActionsObj.clickChatNowLink();
		Thread.sleep(5000);
	}


	@When("^User switches to the Chat Now window$")
	public void user_switches_to_the_Chat_Now_window() throws Throwable {
		WalgreensChatNowIframeActionsObj.switchiframe();
	}

	@When("^User type \"([^\"]*)\" in chat text field$")
	public void user_type_in_chat_text_field(String greeting) throws Throwable {
		WalgreensChatNowIframeActionsObj.enterText(greeting);
	}

	@When("^User clicks on the send button$")
	public void user_clicks_on_the_send_button() throws Throwable {
		WalgreensChatNowIframeActionsObj.clickSubmitButton();
	}
	@Then("^User should be able to submit the message successfully$")
	public void user_should_be_able_to_submit_the_message_successfully() throws Throwable {
	   
	}

}
