package com.programs.arrays;

import java.util.Arrays;

public class SubArrayMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {-2,1,-3,4,-1,2,1,-5,4};
    	System.out.println(subArrayMaxSum(arr2));

	}
	
	private static int subArrayMaxSum(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		int start = -1,end = -1;
		for(int i=0;i<n;i++) {
			if(sum == 0) {
				start = i;
			}
			sum = sum + arr[i];
//			maxSum = Math.max(maxSum, sum);
			if(sum>maxSum) {
				maxSum = sum;
				end = i;
			}
			if(sum<0) {
				sum = 0;
			}
		}
		Arrays.stream(arr,start,end).forEach(n1 -> System.out.print(n1 + " "));
		return maxSum;
		
		
		
	}

}
