package com.lao.json.schema;

import java.io.File;

import javax.mail.internet.PreencodedMimeBodyPart;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class RestAssuredJsonSchemaValidationUsingJsonSchema {
	
	@Test
	public void validationUsingMatchesJsonSchema() {
		
		File inputJson = new File("src/test/resources/input.json");
		File inputSchema = new File("src/test/resources/schema.json");
		
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type","application/json")
		.body(inputJson)
		.when()
		.post("employees")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchema(inputSchema));
		
	}

}
