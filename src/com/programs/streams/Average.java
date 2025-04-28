package com.programs.streams;

import java.util.Arrays;
import java.util.List;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(list.stream().mapToDouble(n -> n).average().orElse(0.0));
	}

}
