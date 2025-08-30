package com.programs.arrays;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 =  {2,5,1,3,0};
	    System.out.println("The Largest element in the array is: "+findLargestElement(arr1));

	}

	private static int findLargestElement(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}

}
