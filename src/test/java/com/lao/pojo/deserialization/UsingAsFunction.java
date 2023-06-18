package com.lao.pojo.deserialization;

import static io.restassured.RestAssured.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.common.mapper.TypeRef;

@Test
public class UsingAsFunction {
	
	
	
	public void usingasFunction() {
		
		Map<String,Object> response=	given()
		.baseUri("http://localhost:3000/")
		.when()
		.get("employees/1")
		.then()
		.extract()
		.as(new TypeRef <Map<String,Object>>()
				{
			
				});
		System.out.println(response);
	}
	

}
