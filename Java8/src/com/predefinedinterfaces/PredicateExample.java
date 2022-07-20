package com.predefinedinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	
	public boolean test(Integer i) {
		if(i%2==0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		Predicate<Integer> p1 = i->i%2==0;
		Predicate<Integer> p2 = j->j%2==0;
		System.out.println(p2.test(21));
		System.out.println(p1.test(10));
		
	}
	
	// the equivalent java8 code for above code i -> i%2==0 ;
	
}
