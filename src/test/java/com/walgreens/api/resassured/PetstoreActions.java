package com.walgreens.api.resassured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class PetstoreActions {
	
	private static final String BASE_URI = "https://petstore.swagger.io/v2";
	
	public Response searchPetsByStatus(String status) {
        return given()
                .baseUri(BASE_URI)
                .queryParam("status", status)
                .when()
                .get("/pet/findByStatus");
    }

}
