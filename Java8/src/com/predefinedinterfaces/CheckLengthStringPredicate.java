package com.predefinedinterfaces;

import java.util.function.Predicate;

//predicate chk length string >5
public class CheckLengthStringPredicate {

	public static void main(String[] args) {
		
		String check = "Microsoft";
		
		Predicate<String> s = len -> len.length()==5;
		
		System.out.println(s.test(check));
		
	
	}

}
