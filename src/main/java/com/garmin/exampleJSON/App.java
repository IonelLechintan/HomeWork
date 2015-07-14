package com.garmin.exampleJSON;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.ObjectMapper;

class App {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();
		JsonFactory jFactory = new JsonFactory();
		// JsonParser jParser= jFactory.createJsonParser(new File("JSON.txt"));
		try {

			JsonNode rootNode = mapper.readValue(new File("JSON.txt"),
					JsonNode.class);
			JsonParser jParser= mapper.getJsonFactory().createJsonParser(new File("JSON.txt"));
		while(jParser.nextToken()!=null){
				
				System.out.println(jParser.getCurrentName());
			}
			rootNode=mapper.readTree(jParser);
			
			
			//System.out.println(rootNode);
	
			
			
			
			
			/*
			 * while(jParser.nextToken()!=JsonToken.END_OBJECT){
			 * System.out.println(jParser.getCurrentName()); }
			 */

		} catch (IOException e) {

		}

	}
}