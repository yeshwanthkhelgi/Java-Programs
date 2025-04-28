package com.programs.streams;

import java.util.Arrays;
import java.util.List;

public class MaxAndMinValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(list.stream().mapToInt(n -> n).max().orElse(0));
		System.out.println(list.stream().mapToInt(n -> n).min().orElse(0));
		System.out.println(list.stream().max((a,b) -> a-b).orElse(0));
		System.out.println(list.stream().min((a,b) -> a-b).orElse(0));
	}

}
