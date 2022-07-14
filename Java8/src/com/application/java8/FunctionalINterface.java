package com.application.java8;

import com.interfaces.Interif;

public class FunctionalINterface {

	public static void main(String[] args) {
		
		
		Interif i = () -> System.out.println("Check Functional Interface");

		i.m1();
	}
	
	

}

