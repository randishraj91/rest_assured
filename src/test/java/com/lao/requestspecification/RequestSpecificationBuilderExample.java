package com.lao.requestspecification;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RequestSpecBuilder builder= new RequestSpecBuilder();
		
		builder.setBaseUri("http://localhost:3000/");
		builder.setBasePath("employees");
		
		RequestSpecification spec= builder.build();
		
		RestAssured.given().spec(spec).get("/1").prettyPrint();
		

	}

}
