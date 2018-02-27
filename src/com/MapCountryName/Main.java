package com.MapCountryName;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		demoBufferReader();
		Map<String, Country> map = demoBufferReader();
		Scanner iScanner = new Scanner(System.in);
		System.out.println("please enter country code");
		String string = "";
		while ((string= iScanner.nextLine()).length()>0) {
			System.out.println(map.get(string));
		}
	}

	public static void demo1() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("th", "Thailand");

	}

	public static void demo2() {
//		Map<String, Country> map = new HashMap<String, Country>();
//		map.put("th", new Country("ประเทศไทย", "Thailand"));
//		map.put("cn", new Country("ประเทศจีน", "Chaina"));
//		map.put("jp", new Country("ประเทศญี่ปุ่น", "Japan"));
//		System.out.println(map.get("jp"));
	}

	
	public static Map<String, Country> demoBufferReader() {
		Map<String, Country> map = new HashMap<String,Country>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("country.csv"));
			String string ="";
			while ((string = reader.readLine()) != null) {
				String[] data = string.split("\\|"); //regex : regular expression
				map.put(data[0], new Country(data[1], data[2], data[3]));
//				System.out.printf("%s %s %s %s\n",data[0],data[1],data[2],data[3]);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
}
