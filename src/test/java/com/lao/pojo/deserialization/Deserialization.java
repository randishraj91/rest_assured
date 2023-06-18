package com.lao.pojo.deserialization;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lao.pojo.seralization.Employee;

public class Deserialization {
	
	String json="{\r\n"
			+ "  \"firstName\" : \"Stone\",\r\n"
			+ "  \"lastName\" : \"Cold\",\r\n"
			+ "  \"email\" : \"Stonecold@dgr.in\",\r\n"
			+ "  \"skills\" : [ \"java\", \"selenium\" ]\r\n"
			+ "}";
	
	@Test
	public void UsingObjectMapper() throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
	Employee employee=	mapper.readValue(json, Employee.class);
	System.out.println(employee.getFirstName());
	System.out.println(employee.getLastName());
	System.out.println(employee.getEmail());
	System.out.println(employee.getSkills());
	}

	

}
