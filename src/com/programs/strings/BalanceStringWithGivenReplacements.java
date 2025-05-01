package com.programs.strings;

import java.util.Arrays;

public class BalanceStringWithGivenReplacements {

	public static void main(String[] args) {
        // Question
//		A string consists solely of the characters '<' and '>'. 
//		The string is considered balanced if every '<' appears 
//		before a corresponding '>' character. The characters do 
//		not have to be adjacent, and each '<' and '>' forms 
//		a unique pair that cannot be part of another pair.
//		To balance a string, any '>' character can be replaced 
//		with the sequence '<>'.
//		Given an array of expressions and a corresponding array of
//		maximum replacements, determine if each string can be balanced.
//		Return an array where the th value is 1 if expressions[i] can be 
//		balanced using up to maxReplacements[i] replacements, or 0 otherwise.
		String[] expressions = {"<<>>", "<><>", ">>", "<<>", "><><", ">>><<"};
		int[] replacements = {0, 1, 2, 2, 2, 2};
		balancedOrNot(expressions,replacements);

	}

	private static void balancedOrNot(String[] expressions, int[] maxReplacements) {
		// TODO Auto-generated method stub
		int[] result = new int[expressions.length];
		for(int i=0; i<expressions.length;i++) {
			String exp = expressions[i];
			int replaceCount = maxReplacements[i];
			int open = 0;
			int neededReplacements = 0;
			
			for(char c : exp.toCharArray()) {
				if(c == '<') {
					open++;
				}
				else if(c == '>') {
					if(open>0) {
						open--;
					}
					else {
						neededReplacements++;
					}
				}
			}
			
			if (open == 0 && neededReplacements <= replaceCount) {
                result[i] = 1; 
            } else {
                result[i] = 0; 
            }
		}
		
		System.out.println(Arrays.toString(result));
	}

}
