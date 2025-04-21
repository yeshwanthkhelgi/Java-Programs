package com.programs;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,2,3,3,4,5,6,7};
		int[] arr2 = {2,3,3,5,6,6,7};
		intersectionOfTwoSortedArrays(arr1,arr2);

	}

	private static void intersectionOfTwoSortedArrays(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int n1 = a.length;
		int n2 = b.length;
		int[] vistingArray = new int[n2];
		ArrayList<Integer> intersection = new ArrayList<>();
		for(int i=0;i<n1;i++){
			for(int j=0;j<n2;j++) {
			if(a[i] == b[j] && vistingArray[j] == 0) {
					intersection.add(a[i]);
					vistingArray[j] = 1;
					break;
				}
			if(b[j]>a[i]) {
				break;
			}
			}
		
		}
		
		
		for(int t : intersection) {
			System.out.print(t + " ");
		}
		
	}

}
