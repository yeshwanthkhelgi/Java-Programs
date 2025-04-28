package com.programs.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Yeshwanth","Abhas","Bhavan");
		System.out.println(list.stream().sorted().toList());
		System.out.println(list.stream().sorted(Comparator.reverseOrder()).toList());
		

	}

}
