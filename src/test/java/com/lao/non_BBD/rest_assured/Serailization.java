package com.lao.non_BBD.rest_assured;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Serailization {
	@Test
	public void Serailization() { 
	
	Map <String,Object> jsonb= new HashMap<String,Object>();
	List<String> skills = new ArrayList<String>();
	
	jsonb.put("first_name", "Ric");
	jsonb.put("last_name", "Flair");
	jsonb.put("email", "ricflair@gmal.com");
	skills.add("java");
	skills.add("Selenium");
	jsonb.put("skills", skills);
	
	System.out.println(jsonb);
	
	given()
	.baseUri("http://localhost:3000/")
	.header("Content-Type","application/json").
	body(jsonb)
	.log().all()
	.when()
	.post("employees")
	.then()
	.log()
	.all();
	



}
}