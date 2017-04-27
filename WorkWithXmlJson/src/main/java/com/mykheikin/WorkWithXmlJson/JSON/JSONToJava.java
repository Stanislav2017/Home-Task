package com.mykheikin.WorkWithXmlJson.JSON;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

public class JSONToJava {

	public static void main(String[] args) {

		String filePath = "C:\\Users\\User\\workspace\\ParserJavaJSONJava\\src\\main\\java\\com\\mykheikin\\ParserJavaJSONJava\\staff.json";

		Gson gson = new Gson();

		try (Reader reader = new FileReader(filePath)) {

			// Convert JSON to Java Object
			Staff staff = gson.fromJson(reader, Staff.class);
			System.out.println(staff);

			// Convert JSON to JsonElement, and later to String
			/*
			 * JsonElement json = gson.fromJson(reader, JsonElement.class);
			 * String jsonInString = gson.toJson(json);
			 * System.out.println(jsonInString);
			 */

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
