package com.application.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Bangalore");
		list.add("Ahemdabad");
		list.add("Ajmer");
		list.add("Mumbai");
		list.add("Pune");
		list.add("Mysore");
		list.add("Austintown");
		list.add("Nyle");
		
		list.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList()).forEach(System.out::println);
		
		
	}

}
