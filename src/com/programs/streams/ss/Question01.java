package com.programs.streams.ss;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

//01 Given a sentence, find the word that has the highest length

public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "I am learning streams api in java";
//		String[] str = word.split(" ");
//		System.out.println(Arrays.toString(str));
//		String ans = Arrays.stream(word.split(" "))
//                .max(Comparator.comparing(s -> s.length())).get();
		String ans = Arrays.stream(word.split(" "))
                .max((s1,s2) -> s1.length() -  s2.length()).get();
		System.out.println(ans);
		

	}

}
