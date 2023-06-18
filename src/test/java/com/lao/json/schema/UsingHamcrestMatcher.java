package com.lao.json.schema;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

@Test
public class UsingHamcrestMatcher {
	public void validate() throws IOException {
		
		File jsonInput = new File("src/test/resources/input.json");
		
		String jsonContent=FileUtils.readFileToString(jsonInput,"UFT-8");
		File Schemanput = new File("src/test/resources/schema.json");
		MatcherAssert.assertThat(jsonContent, JsonSchemaValidator.matchesJsonSchema(Schemanput));
		
		
	}

}
