package com.lao.json.schema;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;

public class NetworkNTJsonSchemaValdator {
	
	@Test
	public void validateJsonSchema() throws IOException {
		
		ObjectMapper om= new ObjectMapper();
		
		JsonSchemaFactory factory=JsonSchemaFactory.getInstance(VersionFlag.V4);
		
		File jsoninput= new File("src/test/resources/input.json");
		InputStream inputschema= new FileInputStream("src/test/resources/schema.json");
		JsonNode jsonnode =om.readTree(jsoninput);
		
		JsonSchema  schema=factory.getSchema(inputschema);
		Set<ValidationMessage>result= schema.validate(jsonnode);
		
		if(result.isEmpty()) {
			System.out.println("No valdataton errors");
		}
		else {
			for (ValidationMessage message : result) {
				System.out.println(message);
			}
		
	}

}}
