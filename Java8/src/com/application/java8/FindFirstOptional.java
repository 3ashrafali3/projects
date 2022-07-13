package com.application.java8;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstOptional {

	public static void main(String[] args) {

		Stream<Integer> intStream = Arrays.asList(10, 20, 30, 40, 50).stream();

		Optional first = intStream.findFirst();

		// Optional second = intStream
		System.out.println(first.get());
	}
	

}
