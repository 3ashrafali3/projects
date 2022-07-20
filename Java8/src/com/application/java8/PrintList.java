package com.application.java8;

import java.util.ArrayList;

public class PrintList {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("test");
		al.add("tes1t");
		al.add("test2");
		al.add("test3");
		
		al.forEach(System.out::println);
	}

}
