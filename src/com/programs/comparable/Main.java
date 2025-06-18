package com.programs.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
        students.add(new Student(22, "Alice"));
        students.add(new Student(20, "Bob"));
        students.add(new Student(21, "Charlie"));

        System.out.println("Before sorting:");
        System.out.println(students);
        
        students.sort(null);
//        Collections.sort(students); // Uses compareTo method

        System.out.println("After sorting by age:");
        System.out.println(students);

	}

}
