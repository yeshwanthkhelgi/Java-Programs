package com.programs.arrays;

import java.util.HashMap;

public class NumberOfSubArraysWithSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
		System.out.println("count : " + numberOfSubArraysWithSumKOptimal(arr,3));

	}

	private static int numberOfSubArraysWithSumKOptimal(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n = arr.length;
		HashMap<Integer, Integer> preSumMap = new HashMap<>();
		preSumMap.put(0, 1); 
		int sum = 0;
		int count = 0;

		for (int i = 0; i < n; i++) {
		    sum += arr[i];                
		    int rem = sum - k;          
		    count += preSumMap.getOrDefault(rem, 0); 
		    preSumMap.put(sum, preSumMap.getOrDefault(sum, 0) + 1); 
		}

		return count;
	}

	private static int numberOfSubArraysWithSumKBruteForce(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int count = 0;
		for(int i=0;i<n;i++) {
			int sum = 0;
			for(int j=i;j<n;j++) {
				sum = sum + arr[j];
				if(sum==k) {
					count++;
				}
			}
		}
		return count;
	}

}
