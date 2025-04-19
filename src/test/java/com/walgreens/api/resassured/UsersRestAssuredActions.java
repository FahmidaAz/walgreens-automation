package com.walgreens.api.resassured;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.File;

public class UsersRestAssuredActions {
	
	public void createUser() {
		given().														//Request Payload
		body(new File(System.getProperty("user.dir") 
				+ "/src/test/resource/ApiRequestPayloads/CreateUserRequest.json")).
	when().															//Setting the Header & Request url
		header("Content-Type", "application/json").
		post("https://petstore.swagger.io/v2/user/createWithList").
	then().															//Printing Response in console
		log().body().
	and().															//Verify status code
		assertThat().statusCode(200).
	and().															//Verify Response using json schema
		body(matchesJsonSchema(new File(System.getProperty("user.dir") 
				+ "/src/test/resource/ApiResponseSchemas/CreateUserResponseSchema.json")));
}
	

	public void updateUser() {
		given().														//Request Payload
		body(new File(System.getProperty("user.dir") 
				+ "/src/test/resource/ApiRequestPayloads/UpdateUserRequest.json")).
	when().															//Setting the Header & Request url
		header("Content-Type", "application/json").
		put("https://petstore.swagger.io/v2/user/fahmidaazmin").
	then().															//Printing Response in console
		log().body().
	and().															//Verify status code
		assertThat().statusCode(200).
	and().															//Verify Response using json schema
		body(matchesJsonSchema(new File(System.getProperty("user.dir") 
				+ "/src/test/resource/ApiResponseSchemas/UpdateUserResponseSchema.json")));
	}

	public void getUser() {
		given().
		when().															//Setting the Header & Request url
		header("Content-Type", "application/json").
		get("https://petstore.swagger.io/v2/user/fahmidaazmin").
	then().															//Printing Response in console
		log().body().
	and().															//Verify status code
		assertThat().statusCode(200).
	and().															//Verify Response using json schema
		body(matchesJsonSchema(new File(System.getProperty("user.dir") 
				+ "/src/test/resource/ApiResponseSchemas/GetUserResponseSchema.json")));
}
	

	public void deleteUser() {
		given().
		when().															//Setting the Header & Request url
		header("Content-Type", "application/json").
		delete("https://petstore.swagger.io/v2/user/fahmidaazmin").
	then().															//Printing Response in console
		log().body().
	and().															//Verify status code
		assertThat().statusCode(200).
	and().															//Verify Response using json schema
		body(matchesJsonSchema(new File(System.getProperty("user.dir") 
				+ "/src/test/resource/ApiResponseSchemas/DeleteUserResponseSchema.json")));
	}
}

	


