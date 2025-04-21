package com.programs;

import java.util.HashSet;

public class UnionOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,1,2,2,2,3,3};
		int[] arr2 = {2,2,3,4,4,5};
		unionOfTwoSortedArrays(arr1,arr2);
	}

	private static void unionOfTwoSortedArrays(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		
		for(int j=0;j<arr2.length;j++) {
			set.add(arr2[j]);
		}
		int n = set.size();
		int[] union = new int[n];
		int i = 0;
		for(int st:set) {
			union[i] = st;
			i++;
		}
		
		for(int t=0;t<n;t++) {
			System.out.print(union[t] + " ");
		}
	}

}
