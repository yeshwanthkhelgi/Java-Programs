package com.programs.streams;

import java.util.Arrays;
import java.util.List;

public class EvenOrOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(list.stream().filter(n -> n%2==0).toList());
		System.out.println(list.stream().filter(n -> n%2==0).mapToInt(n -> n).sum()); // sum() is a method of IntStream, not Stream<Integer>
		System.out.println(list.stream().filter(n -> n%2!=0).toList());
	}

}
