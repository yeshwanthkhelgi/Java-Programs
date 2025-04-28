package com.programs.streams;

import java.util.Arrays;
import java.util.List;

public class StringStartsWithSpecificLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str = Arrays.asList("Yesh","Abhas","Yeshwanth");
		char startingLetter = 'y';
		System.out.println(str.stream().map(n -> n.toLowerCase()).filter(n -> n.startsWith(String.valueOf(startingLetter))).count());
	}

}
