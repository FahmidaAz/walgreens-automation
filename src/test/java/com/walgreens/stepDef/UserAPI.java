package com.walgreens.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import java.io.File;

public class UserAPI {
	
	public void createUser(){
		
		given().														//Request Payload
		body(new File(System.getProperty("user.dir") 
				+ "/src/test/resource/APIRequestPayloads/CreateUserRequest.json")).
	when().															//Setting the Header & Request url
		header("Content-Type", "application/json").
		post("https://petstore.swagger.io/v2/pet").
	then().															//Printing Response in console
		log().body().
	and().															//Verify status code
		assertThat().statusCode(200).
	and().															//Verify Response using json schema
		body(matchesJsonSchema(new File(System.getProperty("user.dir") 
				+ "/src/test/resource/APIResponseSchemas/CreateUserResponse.json")));
}
			
	
	public void updateUser(){
		given().														//Request Payload
		body(new File(System.getProperty("user.dir") 
				+ "/src/test/resource/APIRequestPayloads/UpdateUserRequest.json")).
	when().															//Setting the Header & Request url
		header("Content-Type", "application/json").
		put("https://petstore.swagger.io/v2/pet").
	then().															//Printing Response in console
		log().body().
	and().															//Verify status code
		assertThat().statusCode(200).
	and().															//Verify Response using json schema
		body(matchesJsonSchema(new File(System.getProperty("user.dir") 
				+ "/src/test/resource/APIResponseSchemas/UpdateUserResponse.json")));
}
		
	
	
	public void getUser(){
		given().														//Request Payload

		when().															//Setting the Header & Request url
		header("Content-Type", "application/json").
		get("https://petstore.swagger.io/v2/pet/9").
		then().															//Printing Response in console
		log().body().
		and().															//Verify status code
		assertThat().statusCode(200).
		and().															//Verify Response using json schema
		body(matchesJsonSchema(new File(System.getProperty("user.dir") 
				+ "/src/test/resource/APIResponseSchemas/GetUserResponse.json")));


	}
	
	public void deleteUser(){
		given().														//Request Payload

		when().															//Setting the Header & Request url
		header("Content-Type", "application/json").
		delete("https://petstore.swagger.io/v2/pet/9").
		then().															//Printing Response in console
		log().body().
		and().															//Verify status code
		assertThat().statusCode(200).
		and().															//Verify Response using json schema
		body(matchesJsonSchema(new File(System.getProperty("user.dir") 
				+ "/src/test/resource/APIResponseSchemas/DeleteUserResponse.json")));


	}
		
}


