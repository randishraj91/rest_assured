package com.lao.serializeanddeserialize;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lao.pojo.seralization.Employee;

public class SerialzieAndDeserialize {
	
	String employeeJson;
	ObjectMapper mapper = new ObjectMapper();
	
	public void seralize() throws JsonProcessingException {
		Employee employeeone= new Employee();
		employeeone.setFirstName("Stone");
		employeeone.setLastName("Cold");
		employeeone.setEmail("Stonecold@dgr.in");
		employeeone.setSkills(Arrays.asList("java","selenium"));
		
		String employeeJson=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employeeone);
		
		System.out.println(employeeJson);
		
		
	}
	
	public void deseralize() throws JsonMappingException, JsonProcessingException {
		String json="{\r\n"
				+ "  \"firstName\" : \"Stone\",\r\n"
				+ "  \"lastName\" : \"Cold\",\r\n"
				+ "  \"email\" : \"Stonecold@dgr.in\",\r\n"
				+ "  \"skills\" : [ \"java\", \"selenium\" ]\r\n"
				+ "}";
		
		
		Employee employee=	mapper.readValue(json, Employee.class);
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getSkills());
		
	}
	
	public static void main(String[] args) throws JsonProcessingException {
		
		SerialzieAndDeserialize serialzieAndDeserialize = new SerialzieAndDeserialize();
		serialzieAndDeserialize.deseralize();
		
	}

}
