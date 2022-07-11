package com.application.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapexample {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
		
		list.stream().map(String::toUpperCase).map(x->x+",").collect(Collectors.toList()).forEach(System.out::print);

	}

}
