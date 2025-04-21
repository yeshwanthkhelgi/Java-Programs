package com.programs;

import java.util.Arrays;

public class RemoveDuplicatesOptimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,2,2,3,3};
		Arrays.sort(arr);
		int k = removeDuplicates(arr);
		for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
	}

	private static int removeDuplicates(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int i = 0;
		for(int j=1;j<n;j++) {
			if(arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return i+1;
	}

}
