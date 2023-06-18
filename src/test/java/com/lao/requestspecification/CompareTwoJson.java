package com.lao.requestspecification;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.internal.filter.ValueNodes.JsonNode;

public class CompareTwoJson {
	
	static String  jsonone=" {\r\n"
			+ "\"id\": 4,\r\n"
			+ "       \"first_name\": \"Under\",\r\n"
			+ "        \"last_name\": \"Taker\",\r\n"
			+ "        \"email\": \"undertaker@codingthesmartway.com\"\r\n"
			+ "    }";
	
	static String jsontwo=" {\r\n"
			+ "\"id\": 4,\r\n"
			+ "       \"first_name\": \"Under\",\r\n"
			+ "        \"last_name\": \"Taker\",\r\n"
			+ "        \"email\": \"undertaker@codingthesmartway.com\"\r\n"
			+ "    }";

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		
		ObjectMapper mapper = new ObjectMapper();
		com.fasterxml.jackson.databind.JsonNode n1=mapper.readTree(jsonone);
		
		com.fasterxml.jackson.databind.JsonNode n2=mapper.readTree(jsontwo);
		System.out.println(n1.equals(n2));

	}

}
