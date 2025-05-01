package com.programs.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1,5,2,3,4,2,3,4};
//		Arrays.sort(arr);
		int k = removeDuplicatesBruteForce(arr);
		for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
		//optimal
		System.out.println();
		int[] arr1 = {1,1,2,2,2,3,3};
		Arrays.sort(arr1);
		int t = removeDuplicatesOptimal(arr1);
		for (int i = 0; i < t; i++) {
            System.out.print(arr1[i] + " ");
        }

	}
	
	private static int removeDuplicatesOptimal(int[] arr) {
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

	private static int removeDuplicatesBruteForce(int[] arr) {
		// TODO Auto-generated method stub
		HashSet<Integer> st = new HashSet<>();
		for(int a : arr) {
			st.add(a);
		}
		int k = st.size();
		int j = 0;
		for(int x : st) {
			arr[j] = x;
			j++;
		}
		return k;
	}

}
