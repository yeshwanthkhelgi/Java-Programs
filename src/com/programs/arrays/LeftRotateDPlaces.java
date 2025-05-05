package com.programs.arrays;

import java.util.Arrays;

public class LeftRotateDPlaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(leftRotateDPlaces(arr,2)));

	}

	private static int[] leftRotateDPlaces(int[] arr, int d) {
		// TODO Auto-generated method stub
//		int[] temp = new int[d];
		int n = arr.length;
		d = d % n;
		d = n - d; // right rotation case
//		for(int i=0;i<d;i++) {
//			temp[i] = arr[i];
//		}
//		for(int j=d;j<n;j++) {
//			arr[j-d] = arr[j];
//		}
//		
//		for(int k=n-d;k<n;k++) {
//			arr[k] = temp[k-(n-d)];
//		}
//		return arr;
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
		
		return arr;
		
	}

	private static void reverse(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		while(start<=end) {
			int temp = arr[start];
		    arr[start] = arr[end];
		    arr[end] = temp;
		    start++;
		    end--;
		}
		
	}

}
