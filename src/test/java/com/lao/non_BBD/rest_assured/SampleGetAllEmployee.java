package com.lao.non_BBD.rest_assured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleGetAllEmployee {

	
		@Test(enabled = false)
		public void getAllEmloyees() { 
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification requestSpecification=RestAssured.given();
		
		Response response=requestSpecification.request(Method.GET,"employees");
		
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
		
		}
		@Test(enabled = false)
		public void createAllEmloyees() { 
			RestAssured.baseURI="http://localhost:3000/";
			RequestSpecification requestSpecification= RestAssured
					.given().header("Content-Type","application/json")
					.body("  {\r\n"
							+ "        \"id\": 5,\r\n"
							+ "        \"first_name\": \"bigg\",\r\n"
							+ "        \"last_name\": \"showt\",\r\n"
							+ "        \"email\": \"bigsihow@codingthesmartway.com\"\r\n"
							+ "    }");
			Response response= requestSpecification.request(Method.POST,"employees");
			System.out.println(response.asPrettyString());
			System.out.println(response.getStatusLine());
			
			
		}
		@Test(enabled = false)
		public void putAllEmployees() {
			RestAssured.baseURI="http://localhost:3000/";
			RequestSpecification requestSpecification=RestAssured
					.given().header("Content-Type","application/json")
					.body("  {\r\n"
							+ "       \"first_name\": \"Triple\",\r\n"
							+ "        \"last_name\": \"HH\",\r\n"
							+ "        \"email\": \"triplehh@codingthesmartway.com\"\r\n"
							+ "    }");
			Response response=requestSpecification.request(Method.PUT,"employees/4");
			System.out.println(response.asPrettyString());
			
		}
		@Test
		public void  deleteAllEmployees(){
			RestAssured.baseURI="http://localhost:3000/";
			RequestSpecification  RequestSpecification =RestAssured.given();
			Response response=RequestSpecification.request(Method.DELETE,"employees/4");
			
			System.out.println(response.asPrettyString());
			
		}
}


