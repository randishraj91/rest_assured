package com.lao.json.schema;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class RestAssuredJsonSchemaValidationUsingJsonSchemaInclassPath {

	@Test
	public void  validionusingJsonSchemaClassPath() {
		File inputJson = new File("src/test/resources/input.json");
		
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type","application/json")
		.body(inputJson)
		.when()
		.post("employees")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));		
		
	}
}

