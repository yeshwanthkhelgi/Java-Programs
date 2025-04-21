package com.programs.arrays;

import java.util.Arrays;

public class MoveZerosAtEndOptimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,0,4,6,0,0,1,0,4};
		System.out.println(Arrays.toString(moveZerosAtEnd((arr))));

	}

	private static int[] moveZerosAtEnd(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int j = -1;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				j = i;
				break;
			}
		}
		
        if (j == -1) return arr;

		int temp = 0;
		
		for(int i=j+1;i<n;i++) {
			if(arr[i] != 0) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		
		return arr;
		
	}

}
