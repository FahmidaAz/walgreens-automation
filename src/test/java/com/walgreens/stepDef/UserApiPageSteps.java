package com.walgreens.stepDef;

import com.walgreens.api.resassured.UsersRestAssuredActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserApiPageSteps {
	UsersRestAssuredActions UsersRestAssuredActionsObj = new UsersRestAssuredActions();
	@Given("^Create User$")
	public void create_User() throws Throwable {
		UsersRestAssuredActionsObj.createUser();
	}

	@When("^Update User$")
	public void update_User() throws Throwable {
		UsersRestAssuredActionsObj.updateUser();
	}

	@Then("^Get User$")
	public void get_User() throws Throwable {
		UsersRestAssuredActionsObj.getUser();
	}

	@Then("^Delete User$")
	public void delete_User() throws Throwable {
		UsersRestAssuredActionsObj.deleteUser();
	}


}
