package com.programs.strings;

public class IsSubsequence {
	
	public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; 
            }
            j++; 
        }

        return i == s.length(); 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		String t = "ahbgdc";
		System.out.println(isSubsequence(s,t));


	}

}
