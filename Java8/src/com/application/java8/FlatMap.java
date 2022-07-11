package com.application.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {

		List<String> teamIndia = Arrays.asList("Virat", "Dhoni", "Jadeja");
		List<String> teamPakistan = Arrays.asList("Shoaib", "Dhoni1", "Jadeja1");
		List<String> teamBangladesh = Arrays.asList("Ashraf", "Dhoni2", "Jadeja2");
		List<String> teamEngland = Arrays.asList("Broad", "Dhoni3", "Jadeja3");
		
		
		List<List<String>> la = new ArrayList<>();
		la.add(teamIndia);
		la.add(teamPakistan);
		la.add(teamBangladesh);
		la.add(teamEngland);
		
		
		 la.stream().flatMap( l -> l.stream())
				.collect(Collectors.toList()).forEach(System.out::print);
				
				//forEach(s -> System.out.print(s));
		
		
	}
}
