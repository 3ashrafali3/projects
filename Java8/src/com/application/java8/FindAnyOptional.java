package com.application.java8;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class FindAnyOptional {
	public static void main(String[] args) {
		
		Stream<Integer> intel = Arrays.asList(40,10,20,30).stream();
		
		Optional opt = intel.findAny();
		
		if(!opt.isEmpty()) {
			
			System.out.println(opt.get());
		}

	}

}
