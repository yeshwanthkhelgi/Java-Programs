package com.programs;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArraysOptimal {

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
	    ArrayList<Integer> ans = new ArrayList<>();
	    int i=0;
	    int j=0;
	    while(i<n1 && j<n2) {
	    	if(a[i]<b[j]) {
	    		i++;
	    	}
	    	else if(a[i]>b[j]) {
	    		j++;
	    	}
	    	else {
	    		ans.add(a[i]);
	    		i++;
	    		j++;
	    	}
	    }
	    
	    for(int t : ans) {
			System.out.print(t + " ");
		}
		
	}

}
