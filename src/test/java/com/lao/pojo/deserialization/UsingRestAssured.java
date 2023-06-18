package com.lao.pojo.deserialization;

import org.testng.annotations.Test;

import com.lao.pojo.seralization.Employee;

import io.restassured.RestAssured;


public class UsingRestAssured {
	
	String json="{\r\n"
			+ "  \"firstName\" : \"Stone\",\r\n"
			+ "  \"lastName\" : \"Cold\",\r\n"
			+ "  \"email\" : \"Stonecold@dgr.in\",\r\n"
			+ "  \"skills\" : [ \"java\", \"selenium\" ]\r\n"
			+ "}";
	@Test
	public void usingRAJsonPath() {
		
		io.restassured.path.json.JsonPath jsonpath
		=io.restassured.path.json.JsonPath.from(json);
		
		Employee employee=jsonpath.getObject("$", Employee.class);
		
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getSkills());
		
	}

}
