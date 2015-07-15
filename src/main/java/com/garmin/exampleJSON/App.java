package com.garmin.exampleJSON;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;

import com.garmin.JsonKeys.Parser;

public class App {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(
				org.codehaus.jackson.map.DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES,
				false);

		try {

			JsonParser jParser = mapper.getJsonFactory().createJsonParser(
					new File("JSON.txt"));
			Parser web = mapper.readValue(jParser, Parser.class);
			mapper.enable(org.codehaus.jackson.map.SerializationConfig.Feature.INDENT_OUTPUT);
			mapper.writeValue(System.out, web);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}