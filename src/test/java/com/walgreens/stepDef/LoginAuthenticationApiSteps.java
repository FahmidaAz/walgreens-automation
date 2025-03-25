package com.walgreens.stepDef;

import static org.testng.Assert.assertNotNull;

import com.walgreens.api.resassured.UserLoginRestAssuredActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginAuthenticationApiSteps {
	
	UserLoginRestAssuredActions UserLoginRestAssuredActionsObj = new UserLoginRestAssuredActions();
	@Given("^A registered user exists$")
	public void a_registered_user_exists() throws Throwable {
		UserLoginRestAssuredActionsObj.registerUser();
	}

	@When("^The user logs in with correct username and password$")
	public void the_user_logs_in_with_correct_username_and_password() throws Throwable {
		UserLoginRestAssuredActionsObj.UserLogin();
	}

	@Then("^The response should contain a valid session token$")
	public void the_response_should_contain_a_valid_session_token() throws Throwable {
		assertNotNull("Session token is missing in the response", "200");
	}
}
