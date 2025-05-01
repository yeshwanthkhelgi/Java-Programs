package com.programs.strings;

import java.util.Arrays;

public class ReverseWordsInString {
    
    public static void main(String[] args) {
        String s = "  hello   world  ";
        s = s.trim();  // Trim the string
        String[] words = s.split("\\s+");  // Split into words
        String[] reversedWords = reverse(words);
        String result = String.join(" ", reversedWords);
        System.out.println(result);  
    }

    private static String[] reverse(String[] words) {
        int start = 0;
        int end = words.length - 1;
        String temp;
        while (start < end) {
            temp = words[start];
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;
        } 
        return words; 
    }
}
