package com.execution;

import java.util.function.Function;

public class FunctionPrac {

	public static void main(String[] args) {

		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(4));
		
		
		//example "bangalore" to check its length
		
		Function<String,Integer> f1= t->t.length();
		
		System.out.println("length : "+f1.apply("bangalore"));
		
		//to upper case
		
		Function<String,String> fstr = t ->t.toUpperCase();
		
		System.out.println("length : "+fstr.apply("unitedkingdom"));

	}

}
