package com.programs;

public class PalindromeStringNumber {
	
	public static void checkPalindromeNumber(int n) {
//		int r,sum = 0,temp = n;
//		while(n>0) {
//			r = n % 10;
//			sum = sum*10 + r;
//			n = n/10;
//		}
//		if(temp == sum) {
//			System.out.println(temp + " is a palindrome number");
//		}
//		else {
//			System.out.println(temp + " is not a palindrome number");
//		}
		String original = Integer.toString(n); // Convert int to String
        String reversed = new StringBuilder(original).reverse().toString(); // Reverse it

        if(original.equals(reversed)) {
            System.out.println(n + " is a palindrome number");
        } else {
            System.out.println(n + " is not a palindrome number");
        }
		
		
	}
	
	public static void checkStringPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str + " is a palindrome string");
        } else {
            System.out.println(str + " is not a palindrome string");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPalindromeNumber(454);
		checkPalindromeNumber(452);
		checkPalindromeNumber(22);
		checkStringPalindrome("Madam");

	}

}
