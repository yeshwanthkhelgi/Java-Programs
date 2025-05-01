package com.programs.strings;

public class StringCompression {
	
	public static int compressOptimal(char[] chars) {
        int write = 0;  
        int read = 0;   

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            chars[write++] = currentChar;

            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        for(int i=0;i<write;i++) {
        	System.out.print(chars[i] + " ");
        }
        System.out.println();
        return write; 
    }
	
	public static int compressBruteForce(char[] chars) {
        int n = chars.length;
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < n) {
            char current = chars[i];
            int count = 0;

            while (i < n && chars[i] == current) {
                i++;
                count++;
            }

            sb.append(current);
            if (count > 1) {
                sb.append(String.valueOf(count));
            }
        }

        for (int j = 0; j < sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }

        return sb.length();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
		System.out.println(compressOptimal(chars));
	}
	
	

}
