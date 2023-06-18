package com.lao.jsonpath;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Predicate;

public class CreateTheOwnPredicate {
	
	@Test
	public void ownpredcate() throws IOException {
		
		File jsonfile = new File("src/test/resources/readerJsonInput.json");
		
//		Predicate books = new  Predicate() {
//
//			@Override
//			public boolean apply(PredicateContext ctx) {
//				// TODO Auto-generated method stub
//				boolean predicate=ctx.item(Map.class).containsKey("title");
//				return predicate;
//			}
//		};
		
		Predicate books=ctx->ctx.item(Map.class).containsKey("title");
		
		
		 
	List<Map<String,Object>> result=	JsonPath.parse(jsonfile).read("$.books.[?].author",List.class, books);
	System.out.println(result);
		
	}

}
