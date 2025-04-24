package com.programs.arrays;

import java.util.Scanner;

public class StringReduction {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String reduced = reduceString(input);

        System.out.println("Reduced String: " + reduced);
        System.out.println("Length: " + reduced.length());
    }

    public static String reduceString(String str) {
        boolean canReduce = true;

        while (canReduce) {
            canReduce = false;
            StringBuilder sb = new StringBuilder();

            int i = 0;
            while (i < str.length()) {
                if (i < str.length() - 1 && str.charAt(i) != str.charAt(i + 1)) {
                    sb.append(getThird(str.charAt(i), str.charAt(i + 1)));
                    i += 1;  // Skip the next character as it's already paired
                    canReduce = true;
                } else {
                    sb.append(str.charAt(i));
                    i++;
                }
            }

            str = sb.toString();
        }

        return str;
    }

    public static char getThird(char a, char b) {
        if ((a == 'a' && b == 'b') || (a == 'b' && b == 'a')) return 'c';
        if ((a == 'b' && b == 'c') || (a == 'c' && b == 'b')) return 'a';
        if ((a == 'a' && b == 'c') || (a == 'c' && b == 'a')) return 'b';
        return ' '; // fallback, though this should never happen
    }
}
