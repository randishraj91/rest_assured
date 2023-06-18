package com.lao.authorization;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class BearerToken {

	
	//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
	@Test
	public void bearerT() {
		
		String token= "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";
	given()
	.header("Authorization","Bearer"+token)
	.when()
	.get("https://github.com/users/repos")
	
	
	.prettyPrint();
}
}
