package com.programs.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.programs.streams.maxsalary.Employee;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,-2,3,5,0,7,0,4);
		List<Integer> result = Stream.concat(list.stream().filter(n->n!=0), list.stream().filter(n->n==0)).toList();
		System.out.println(result);
		

	}

}
