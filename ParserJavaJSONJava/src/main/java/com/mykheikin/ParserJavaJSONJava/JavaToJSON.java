package com.mykheikin.ParserJavaJSONJava;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class JavaToJSON {

	public static void main(String[] args) {

		String filePath = "C:\\Users\\User\\workspace\\ParserJavaJSONJava\\src\\main\\java\\com\\mykheikin\\ParserJavaJSONJava\\staff.json";

		Staff staff = createDummyObject();

		// 1. Convert object to JSON string
		Gson gson = new Gson();
		String json = gson.toJson(staff);
		System.out.println(json);

		// 2. Convert object to JSON string and save into a file directly
		try (FileWriter writer = new FileWriter(filePath)) {

			gson.toJson(staff, writer);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static Staff createDummyObject() {

		Staff staff = new Staff();
		Address addr = new Address();

		staff.setName("Stanislav");
		staff.setSurname("Mykheikin");

		addr.setCountry("Ukraine");
		addr.setCity("Kiev");
		addr.setStreet("Tupoleva");

		List<String> phones = new ArrayList<>();
		List<String> sites = new ArrayList<>();

		phones.add("0968497463");
		phones.add("0958027639");

		sites.add("youtube.com");
		sites.add("vk.com");

		staff.setPhones(phones);
		staff.setSites(sites);
		staff.setAddr(addr);

		return staff;

	}
}
