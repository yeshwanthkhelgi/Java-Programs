package com.programs.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leetcode";
		System.out.println(reverseVowelsOfString(s));
	}

	private static String reverseVowelsOfString(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb =  new StringBuilder(s);
		Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));		
		int start = 0;
        int end = sb.length() - 1;
        char temp = 0;
        while (start < end) {
            char left = sb.charAt(start);
            char right = sb.charAt(end);
            if (!vowels.contains(left)) {
                start++;
            } else if (!vowels.contains(right)) {
                end--;
            } else {
                sb.setCharAt(start, right);
                sb.setCharAt(end, left);
                start++;
                end--;
            }
        }

        return sb.toString();
	}

}
