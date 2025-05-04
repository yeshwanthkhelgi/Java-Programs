package com.programs.streams.maxsalary;

import java.util.Arrays;
import java.util.List;

public class MaxSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Arrays.asList(
			    new Employee("Alice", 50000),
			    new Employee("Bob", 75000),
			    new Employee("Charlie", 60000)
			);
		Long maxSalary = employees.stream().mapToLong(n -> n.getSalary()).max().orElse(0); // max method is present in OptionalLong interface
		System.out.println(maxSalary);
	}

}
