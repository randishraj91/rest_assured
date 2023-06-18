package com.lao.BBD.rest_assured;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllEmployees {
	
	@Test
	public void getAllEmployeesBBD() {
		
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.when()
		.get("employees")
		.prettyPrint();
		
		
	}
	@Test(enabled = false)
	public void postAllEmployeesBBD() {
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type","application/json")
		.body(" {\r\n"
				+ "\"id\": 4,\r\n"
				+ "       \"first_name\": \"Under\",\r\n"
				+ "        \"last_name\": \"Taker\",\r\n"
				+ "        \"email\": \"undertaker@codingthesmartway.com\"\r\n"
				+ "    }")
		.when()
		.post("employees")
		.prettyPrint();
		
	}
	@Test(enabled = false)
	public void putAllEmployeesBBD() {
		
		RestAssured
		.given().
		baseUri("http://localhost:3000/")
		.header("Content-Type","application/json")
		.body("   {\r\n"
				+ "\r\n"
				+ "       \"first_name\": \"John\",\r\n"
				+ "        \"last_name\": \"Cena\",\r\n"
				+ "        \"email\": \"Johncena@codingthesmartway.com\"\r\n"
				+ "    }")
		.when()
		.put("employees/3")
		.prettyPrint();
		
	}

	@Test(enabled = false)
	public void createEmployeeFromJson() {
		File jsonFile = new File("postData.json"); 
		RestAssured.
		given().baseUri("http://localhost:3000/")
		.header("Content-Type","application/json").
		body("jsonFile")
		.when().
		post("employees/6").
		prettyPrint();
		
}
}
