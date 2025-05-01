package com.programs.strings;

public class LongestSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 3, 5, 1, 9};
		System.out.println(longestSubArray(arr,10));

	}

	private static int longestSubArray(int[] arr,int k) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int len;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int sum = 0;
			for(int j=i;j<n;j++) {
				sum = sum + arr[j];
				
				if(sum==k) {
					len = j-i+1;
					max = Math.max(max, len);
				}
				
			}	
	}
	  return max;	
	}

}
