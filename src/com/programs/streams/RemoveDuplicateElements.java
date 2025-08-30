package com.programs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,1,2,2,2,3,4,5,6,7,8,9,10);
		System.out.println(list.stream().distinct().toList());
		System.out.println(list.stream().collect(Collectors.toSet()));
	}

}
