package com.programs.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100, 200, 1, 3, 2, 4, 5};
		System.out.println(longestConsecutiveSequenceOptimal(arr));
	}
	
	private static int longestConsecutiveSequenceOptimal(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int count = 0;
		int longest = 0;
		HashSet<Integer> set = new HashSet<>();
		for(int num : arr) {
			set.add(num);
		}
		int lastSmaller = Integer.MIN_VALUE;
		for(int num:set) {
			if(!set.contains(num - 1)) {
				lastSmaller = num;
				count = 1;
				while(set.contains(lastSmaller+1)) {
					lastSmaller += 1;
					count++;
				}
				longest = Math.max(longest, count);
			}
		}
		return longest;
	}

	private static int longestConsecutiveSequenceBettter(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		Arrays.sort(arr); // 1 1 1 2 3 4 8 9
		int longest = 1;
		int lastSmaller = arr[0];
		int count = 1;
		for(int i=1;i<n;i++) {
			if(lastSmaller==arr[i]-1) {
				count++;
				lastSmaller = arr[i];
			}
			else if(lastSmaller!=arr[i]){				
				lastSmaller = arr[i];
				count = 1;
			}
			
				longest = Math.max(longest,count);
			
			
		}
		return longest;
		
	}

	public static boolean linearSearch(int []a, int num) {
        int n = a.length; 
        for (int i = 0; i < n; i++) {
            if (a[i] == num)
                return true;
        }
        return false;
    }

	private static int longestConsecutiveSequenceBruteForce(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int longest = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int x =arr[i];
			int count = 1;
			while(linearSearch(arr, x+1)) {
				x += 1;
				count += 1;
			}
			longest = Math.max(longest, count);
		}
		return longest;
	}

}
