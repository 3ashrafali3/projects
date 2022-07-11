package com.application.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TraversingAndPrintingList {

	public static void main(String[] args) {

		List<String> s = new ArrayList<String>();
		s.add("ab");
		s.add("cd");
		s.add("");
		s.add("ef");
		s.add("");
		s.add("gh");
		s.add("ij");
		s.add("");

	//	System.out.println(s);
		
		s.stream().map(String::toUpperCase).forEach(System.out::print);

		 s.stream().filter(x->!x.isEmpty()).map(x->x.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
				
			//	collect(Collectors.toList());
		
	//	System.out.println(d);
	}

}
