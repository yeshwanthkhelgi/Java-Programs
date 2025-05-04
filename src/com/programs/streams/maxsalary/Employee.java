package com.programs.streams.maxsalary;

public class Employee {
	
	String name;
    long salary;

    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }
}
