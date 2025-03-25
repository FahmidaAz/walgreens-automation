package com.walgreens.api.resassured;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.File;

public class UserLoginRestAssuredActions {
	public void registerUser() {
		given().														//Request Payload
		body(new File(System.getProperty("user.dir") 
				+ "/src/test/resource/ApiRequestPayloads/CreateRegisterUserRequest.json")).
	when().															//Setting the Header & Request url
		header("Content-Type", "application/json").
		post("https://petstore.swagger.io/v2/user/createWithList").
	then().															//Printing Response in console
		log().body().
	and().															//Verify status code
		assertThat().statusCode(200).
	and().															//Verify Response using json schema
		body(matchesJsonSchema(new File(System.getProperty("user.dir") 
				+ "/src/test/resource/ApiResponseSchemas/CreateRegisterUserResponseSchema.json")));
}
	
	public void UserLogin() {
		given().
		when().															//Setting the Header & Request url
		header("Content-Type", "application/json").
		get("https://petstore.swagger.io/v2/user/login?username=fahmidaazmin&password=1234").
	then().															//Printing Response in console
		log().body().
	and().															//Verify status code
		assertThat().statusCode(200).
	and().															//Verify Response using json schema
		body(matchesJsonSchema(new File(System.getProperty("user.dir") 
				+ "/src/test/resource/ApiResponseSchemas/GetLoginUserResponseSchema.json")));
}
	

	
}
