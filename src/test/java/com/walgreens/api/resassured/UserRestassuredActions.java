package com.walgreens.api.resassured;

import com.walgreens.stepDef.UserAPI;

import cucumber.api.java.en.*;

public class UserRestassuredActions {
	
	UserAPI UserAPIobj = new UserAPI();

	@Given("^Create User$")
	public void create_User() throws Throwable {
		UserAPIobj.createUser();
	}

	@When("^Update User$")
	public void update_User() throws Throwable {
		UserAPIobj.updateUser();
	}

	@Then("^Get User$")
	public void get_User() throws Throwable {
		UserAPIobj.getUser();
	}

	@Then("^Delete User$")
	public void delete_User() throws Throwable {
		UserAPIobj.deleteUser();
	}
}
