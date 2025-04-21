package com.programs.arrays;

import java.util.HashMap;

public class ReverseNumber {
	
	public static int checkReverseNumber(int n) {
//		int r,rev=0;
//		while(n>0) {
//			r = n % 10;
//			rev = rev*10 + r;
//			n = n/10;
//		}
//		return rev;
		boolean isNegative = n < 0;
        String str = Integer.toString(Math.abs(n));  // Convert number to string
        String reversedStr = new StringBuilder(str).reverse().toString(); // Use reverse()

        int reversedNum = Integer.parseInt(reversedStr);
        return isNegative ? -reversedNum : reversedNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkReverseNumber(-12345));
		
		

	}

}
