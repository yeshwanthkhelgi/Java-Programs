package com.programs.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,1,2,3,4,5,6,7,8,9,10,10);
		System.out.println(list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0));
	}

}
