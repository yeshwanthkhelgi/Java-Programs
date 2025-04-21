package com.programs;

import java.util.ArrayList;

public class UnionOfTwoSortedArraysOptimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,1,2,2,2,3,3};
		int[] arr2 = {2,2,3,4,4,5};
		unionOfTwoSortedArrays(arr1,arr2);

	}

	private static void unionOfTwoSortedArrays(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int n1 = a.length;
		int n2 = b.length;
		int i = 0;
		int j = 0;
		ArrayList<Integer> union = new ArrayList<>();
		while(i<n1 && j<n2) {
			if(a[i] <= b[j]) {
				if(union.size() == 0 || union.get(union.size() - 1) != a[i]) {
					union.add(a[i]);
				}
				i++;
			}
			else {
				if(union.size() == 0 || union.get(union.size() - 1) != b[j]) {
					union.add(b[j]);
				}
				j++;
			}
		}
		
		while(i<n1) {
			if(union.size() == 0 || union.get(union.size() - 1) != a[i]) {
				union.add(a[i]);
			}
			i++;
		}
		
		while(j<n2) {
			if(union.size() == 0 || union.get(union.size() - 1) != b[j]) {
				union.add(b[j]);
			}
			j++;
		}
		
		for(int t : union) {
			System.out.print(t + " ");
		}
		
	}

}
