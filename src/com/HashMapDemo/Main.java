package com.HashMapDemo;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
//Map	Interface
		// HashMap implements Map Interface
		Map<String,String > map = new HashMap<String,String>();
		//Key,Value
		map.put("cn","China");
		map.put("th","Thailand");
		map.put("jp", "Japan");
		
		System.out.println(map.get("jp"));
		
		for(Map.Entry<String,String>item : map.entrySet()) {
			String key = item.getKey();
			String value = item.getValue();
			System.out.printf("%s => %s\n",key,value);
		}
		
		map.put("th", "Siam"); // Replace Key ที่มีอยู่อยู่ก่อนหน้า
		
		for(Map.Entry<String,String>item : map.entrySet()) {
			String key = item.getKey();
			String value = item.getValue();
			System.out.printf("%s => %s\n",key,value);
		}
		
		if(map.containsValue("Japan")){
			System.out.println("Found Japan");
		}
		
		if(map.containsKey("cn")) {
			System.out.println("Found key cn");
		}
		
	}

}
