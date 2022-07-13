package com.application.java8;

import java.util.HashMap;
import java.util.Map;

public class MapLoop {
	public static void main(String[] args) {

		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("A", 10);
		map.put(null, 20);
		map.put("A2", 30);
		map.put("A3", null);
		map.put("A4", 50);
		
		map.forEach((k,v) -> System.out.println("key "+k+" value : "+v));
		
	}
}
