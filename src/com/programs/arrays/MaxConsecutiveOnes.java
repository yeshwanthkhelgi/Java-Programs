package com.programs.arrays;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,0,1,1,1,0,1,1,1,1,1};
		System.out.println(maxConsecutiveOnes(arr));

	}

	private static int maxConsecutiveOnes(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		
		int max = 0;
		int count = 0;
		for(int i=0;i<n;i++) {
			if(arr[i] != 1) {
				count = 0;
				continue;
			}
			count++;
			
			max = Math.max(max, count);
			
		}
		return max;
	}

}
