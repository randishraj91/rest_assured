package com.lao.jsonpath;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class ReadingAJsonDocoument {
	
	@Test(enabled = false)
	public static void readJson() throws IOException {
		
		File file = new  File("src/test/resources/readerJsonInput.json");
		
		
		List<Object> isbnList= JsonPath.read(file, "$..isbn");
	for (Object isbn : isbnList) {
		System.out.println(isbn);
		
	}	
	}
	@Test(enabled = false)
	public void  readJsonParse() throws IOException {
		InputStream file = new FileInputStream("src/test/resources/readerJsonInput.json");
		 
		Object parseJsonDoc=Configuration
		 .defaultConfiguration()
		 .jsonProvider().parse(file.readAllBytes());
		 
		List<Object> pageList= JsonPath.read(parseJsonDoc, "$..publisher");
		
		 for (Object page : pageList) {
			 System.out.println(page);
			
		}
	}
		 @Test
		 public void fluentAPI() throws IOException {
			 
			 File file = new File("src/test/resources/readerJsonInput.json");
			 
			 DocumentContext  context=JsonPath.parse(file);
			 List<Object> listDescription= context.read("$..description");
			 
			 for (Object description : listDescription) {
				System.out.println(description);
			}
//			 Configuration configuration =	 Configuration.defaultConfiguration();
//			 
//			 List<Object> listpublisher= JsonPath.
//			 using(configuration)
//			 .parse(file)
//			 .read("$..publisher");
//			 
//			 for (Object publisher : listpublisher) {
//				System.out.println(publisher);
			}
		 }
	
		 
	




