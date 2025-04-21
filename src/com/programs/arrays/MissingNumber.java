package com.programs.arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		System.out.println(missingNumber(arr,5));

	}

	private static int missingNumber(int[] arr,int k) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int sum = k*(k+1)/2;
		int s = 0;
		for(int a:arr) {
			s = s + a;
		}
		return sum - s;
	}

}
