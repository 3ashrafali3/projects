package com.application.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//Create a List of the square of all distinct numbers

public class Squares {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		
		numbers.stream().map(x->x*x).distinct().collect(Collectors.toList()).forEach(System.out::println);

	}

}
