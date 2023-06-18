package com.lao.jsonpath;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;

import groovyjarjarantlr4.v4.runtime.tree.xpath.XPathRuleAnywhereElement;

import static com.jayway.jsonpath.Criteria.where;
import static com.jayway.jsonpath.Filter.*;

public class FilterPredicateExample {
	
	@Test(enabled = false)
	public void FfiterPredicate() throws IOException {
		File file = new File("src/test/resources/readerJsonInput.json");
		Filter lessThanonefourfve=Filter.
		filter(Criteria.where("pages").lt(472));
		
		List<Object> result=JsonPath.parse(file)
		.read("$.books..[?]",lessThanonefourfve);
		
		System.out.println(result);
		
	}
	@Test
	public void usingsecondfilterpredcate() throws IOException {
		
		File file = new File("src/test/resources/readerJsonInput.json");
		
		Filter  secondFilter=	Filter.filter(Criteria.where("pages").lte(500).and("publisher").is("Apress"));
		
		List<Object>  secondResult=JsonPath.parse(file).read("$.books..[?]",secondFilter);
		System.out.println(secondResult);
	}

	
	public void usingthirdfilterpredcateor() {
		
	//File file  	= new File("src/test/resources/readerJsonInput.json");
	
	filter(where("pages")
			.gt(100).and("books").is(getClass()))
	
	//JsonPath.parse(file).read(null)
	
	}
}
