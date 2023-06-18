package com.lao.requestspecification;

import static io.restassured.RestAssured.*;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RequsetSpecficationExample {
	
	@BeforeSuite
	public void setRequestSpecificaton() {
		requestSpecification =with()
				.baseUri("http://localhost:3000/")
		.basePath("employees");
	}
	
	
	@Test
	public void getAnEmployeesBBD() {
		
	
		given()
		.spec(requestSpecification)
		.when()
		.get("/7")
		.prettyPrint();
		
		}
	
	@Test
	public void getAllEmployeesBBD() {
		
	
		given()
		.spec(requestSpecification)
		.when()
		.get()
		.prettyPrint();
		
		}
}
