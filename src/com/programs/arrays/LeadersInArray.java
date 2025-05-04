package com.programs.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 22, 12, 3, 0, 6};
		leadersInArrayOptimal(arr);
	}

	private static void leadersInArrayOptimal(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		ArrayList<Integer> res = new ArrayList<>();
		for(int i=n-1;i>=0;i--) {
			if(arr[i] > max) {
				res.add(arr[i]);
			}
			max = Math.max(max, arr[i]);
		}
		System.out.println(res.reversed());
	}

	private static void leadersInArrayBruteForce(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		ArrayList<Integer> res = new ArrayList<>();
		for(int i=0;i<n;i++) {
			boolean leader = true;
			for(int j=i+1;j<n;j++) {
				if(arr[i] < arr[j]) {
					leader = false;
					break;
				}
			}
			if(leader) {
				res.add(arr[i]);
			}
		}
		System.out.println(res);
	}

}
