package com.execution;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.beans.Employee;

public class PredicatePractice {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();

		al.add(new Employee("Tom", 12.00));
		al.add(new Employee("Tom1", 56.00));
		al.add(new Employee("Tom2", 43.00));
		al.add(new Employee("Tom3", 32.00));

		Predicate<Employee> p = e -> e.getSalary() > 10.00;

		Predicate<Employee> p1 = e -> e.getName().equals("Tom");

		for (Employee e : al) {

			if (p.and(p1).test(e)) {
				System.out.println(e.getName() + "-" + e.getSalary());
			}
		}
	}
}
