package com.application.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LetterCounter {
	// from a list of names, give me the total number of letters in all the names with more than 5 letters

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Mumbai");
		list.add("Hyderabad");
		list.add("Bangalore");
		list.add("Pune");
		
		long j = list.stream().filter( k -> k.length()>5).mapToInt(s->s.length()).sum();
		
		//collect(Collectors.toList()).forEach(System.out::println);
		
		//.collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("--> "+j+"-->");

	}

}
