package com.lao.requestspecification;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class HowToGetHeadervalue {
	@Test
	public void getheader() {
	
		RequestSpecification specification= RestAssured.given()
	.baseUri("http://localhost:3000/")
	.header("Content-Type","application/json")
	.body(" {\r\n"
			+ "\"id\": 4,\r\n"
			+ "       \"first_name\": \"Under\",\r\n"
			+ "        \"last_name\": \"Taker\",\r\n"
			+ "        \"email\": \"undertaker@codingthesmartway.com\"\r\n"
			+ "    }");
		Response response=	specification.request(Method.POST);
		QueryableRequestSpecification qrs =SpecificationQuerier.query(specification);
		System.out.println(qrs.getHeaders());
		System.out.println(qrs.getBaseUri());

	
}

}
