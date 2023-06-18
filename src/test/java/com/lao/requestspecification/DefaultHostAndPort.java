package com.lao.requestspecification;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class DefaultHostAndPort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured
		.given()
		.log()
		.all()
		.when()
		.get();

	}

}
