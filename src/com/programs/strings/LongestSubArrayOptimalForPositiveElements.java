package com.programs.strings;

public class LongestSubArrayOptimalForPositiveElements {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
	        int[] arr = {2, 3, 5, 1, 9};
	        int k = 10;
	        System.out.println(longestSubArray(arr, k)); // Output: 3
	    }

	    private static int longestSubArray(int[] arr, int k) {
	        int i = 0, sum = 0, maxLen = 0;

	        for (int j = 0; j < arr.length; j++) {
	            sum += arr[j];

	            // Shrink window from the left while sum > k
	            while (sum > k) {
	                sum -= arr[i];
	                i++;
	            }

	            // If sum == k, update maxLen
	            if (sum == k) {
	                maxLen = Math.max(maxLen, j - i + 1);
	            }
	        }

	        return maxLen;
	    }
	}


