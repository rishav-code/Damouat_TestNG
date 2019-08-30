package com.atmecs.flightbooking.read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Flidht_detailsprop_read {
	public String takeproperties(String file) throws FileNotFoundException {

		Properties properties = new Properties();
		FileInputStream f = new FileInputStream("./src/test/resources/locators/flightdetails.properties");
		try {
			properties.load(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String data = properties.getProperty(file);
		return data;
	}

}
