package com.lao.jsonpath;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

public class PredicateExample {
	
	@Test
	public void InLinePredicate() throws IOException {
		File jsonfile = new File("src/test/resources/readerJsonInput.json");
		
	List<Object> priceList=	JsonPath
		.parse(jsonfile)
		.read("$.books[?(@.pages>144 && @.author=='Marijn Haverbeke')]");
	
	System.out.println(priceList);
		
		
		
	}

}
