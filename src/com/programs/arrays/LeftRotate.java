package com.programs.arrays;

public class LeftRotate {
	
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		leftRotate(arr);
	}

	private static void leftRotate(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
//		int temp[]=new int[n];
//		  for (int i = 1; i < n; i++) {
//		    temp[i - 1] = arr[i];
//		  }
//		  temp[n - 1] = arr[0];
//		  for (int i = 0; i < n; i++) {
//		    System.out.print(temp[i]+" ");
//		  }
		int temp = arr[0]; // storing the first element of array in a variable
		  for (int i = 0; i < n - 1; i++) {
		    arr[i] = arr[i + 1];
		  }
		  arr[n - 1] = temp; // assigned the value of variable at the last index
		  for (int i = 0; i < n; i++) {
		    System.out.print(arr[i]+" ");
		  }
		
	}

}
