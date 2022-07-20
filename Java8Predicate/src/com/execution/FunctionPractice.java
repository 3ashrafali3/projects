package com.execution;

import java.util.function.Function;

import com.beans.Student;

public class FunctionPractice {

	public static void main(String[] args) {
		
		Student student = new Student("Holly", 70);
		Student student1 = new Student("Holly1", 93);
		Student student2 = new Student("Holly2", 60);
		Student student3 = new Student("Holly3", 40);
		
		
		Function<Student, String> analyzeStudent = stu -> 
		{
			 if(stu.getMarks()>90) 
			 { 
				 System.out.println(" first Grade : ");
		     }
			 else{
				 System.out.println("less than 90 marks");
			 }; 
		     
		     return "First";
		    };
		
		    
		    System.out.println(analyzeStudent.apply(student3));
		    System.out.println(analyzeStudent.apply(student1));
	}

}
