package com.programs.streams;

import java.util.Arrays;
import java.util.List;

public class ConvertToUpperOrLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str = Arrays.asList("Yesh","Abhas");
		System.out.println(str.stream().map(n -> n.toLowerCase()).toList());
		System.out.println(str.stream().map(n -> n.toUpperCase()).toList());

	}

}
