package com.lao.pojo.deserialization;

import org.testng.annotations.Test;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;
import com.lao.pojo.seralization.Employee;

public class UsingMappingProvider extends Deserialization{
	
	String json="{\r\n"
			+ "  \"firstName\" : \"Stone\",\r\n"
			+ "  \"lastName\" : \"Cold\",\r\n"
			+ "  \"email\" : \"Stonecold@dgr.in\",\r\n"
			+ "  \"skills\" : [ \"java\", \"selenium\" ]\r\n"
			+ "}";
	@Test
	public void usingJayWayPath() {
		JacksonMappingProvider jacksonMappingProvider= new JacksonMappingProvider();
		
		Configuration configuration=	
				Configuration
		.builder()
		.mappingProvider(jacksonMappingProvider)
		.build();
		
		Employee employee=JsonPath.using(configuration)
		.parse(json)
		.read("$",Employee.class);
		
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getSkills());
	}

}
