package com.lao.pojo.seralization;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeOne {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub

		Employee employeeone= new Employee();
		employeeone.setFirstName("Stone");
		employeeone.setLastName("Cold");
		employeeone.setEmail("Stonecold@dgr.in");
		employeeone.setSkills(Arrays.asList("java","selenium"));
		
		System.out.println(employeeone.getFirstName());
		System.out.println(employeeone.getLastName());
		System.out.println(employeeone.getEmail());
		System.out.println(employeeone.getSkills());
		
		ObjectMapper mapper= new ObjectMapper();
		String employeeJson=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employeeone);
		
		System.out.println(employeeJson);
		
		
		
		
	}

	
}
