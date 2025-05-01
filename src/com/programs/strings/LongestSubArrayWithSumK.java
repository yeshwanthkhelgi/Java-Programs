package com.programs.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,1,1,1,1,4,2,3};
		longestSubArrayWithSumK(arr,4);

	}

	private static void longestSubArrayWithSumK(int[] arr, int k) {
		// TODO Auto-generated method stub
		// brute force approach
//		int n = arr.length;
//		int len = 0;
//		int start = -1, end = -1;
//		for(int i=0;i<n-1;i++) {
//			int sum = 0;
//			for(int j=i;j<n;j++) {
//				sum = sum + arr[j];
//				
//				if(sum==k && len<(j-i+1)) {
//					len = j-i+1;
//					start = i;
//					end = j;
//				}
//				
//			}	
//	}
		
		int n = arr.length; // size of the array.
		int start = -1, end = -1;
        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            //calculate the prefix sum till index i:
            sum += arr[i];

            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // calculate the sum of remaining part i.e. x-k:
            long rem = sum - k;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
            	int len = i - preSumMap.get(rem);
            	if(i - preSumMap.get(rem) > maxLen) {
            
                maxLen = Math.max(maxLen, len);
                start = preSumMap.get(rem) + 1;
                end = i;
            	}
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
      System.out.println(maxLen);
      if (start != -1) {
    	    System.out.print("Subarray: ");
    	    for (int i = start; i <= end; i++) {
    	        System.out.print(arr[i] + " ");
    	    }
    	} else {
    	    System.out.println("No subarray found with sum = " + k);
    	}

}
}
