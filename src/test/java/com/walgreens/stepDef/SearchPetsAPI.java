package com.walgreens.stepDef;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import com.walgreens.api.resassured.PetstoreActions;

import cucumber.api.java.en.*;
import io.restassured.response.Response;

public class SearchPetsAPI {

	PetstoreActions PetstoreActionsobj = new PetstoreActions();
	Response response;                                   // Holds the API response for step-to-step access

	@Given("^the Petstore API is available$")
	public void the_Petstore_API_is_available() throws Throwable {

	}

	@When("^I search for pets with status \"([^\"]*)\"$")
	public void i_search_for_pets_with_status(String status) throws Throwable {
		response = PetstoreActionsobj.searchPetsByStatus(status);
		System.out.println("--------- Full API Response ---------");
		response.prettyPrint();  // This prints the response body in JSON format
	}

	@Then("^the response status code should be (\\d+)$")
	public void the_response_status_code_should_be(int statusCode) throws Throwable {
		assertThat(response.statusCode(), is(statusCode));
	}

	@Then("^each pet in the response should have status \"([^\"]*)\"$")
	public void each_pet_in_the_response_should_have_status(String expectedStatus) throws Throwable {
		response.jsonPath().getList("status")
		.forEach(status -> assertThat(status.toString(), equalTo(expectedStatus)));
	}

}
