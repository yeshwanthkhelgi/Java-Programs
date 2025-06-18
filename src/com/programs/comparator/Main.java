package com.programs.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = Arrays.asList(new Student(22,"yeshu"),
				new Student(24,"aman"),
				new Student(22,"brother"));
		
		Comparator<Student> comparator = Comparator
			    .comparing(Student::getAge)
			    .thenComparing(Student::getName);
		students.sort(comparator);
//		students.sort((a,b) -> b.getAge()-a.getAge());
		for(Student s:students) {
			System.out.println(s.getName() + " : " + s.getAge());
		}

	}

}
