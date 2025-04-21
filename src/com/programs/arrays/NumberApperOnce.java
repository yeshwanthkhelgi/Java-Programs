package com.programs.arrays;

import java.util.LinkedHashMap;

public class NumberApperOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,3,3,4,4};
		System.out.println(numberAppearOnce(arr));
		

	}

	private static int numberAppearOnce(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		// brute force approach
//		int num;
//		for(int i=0;i<n;i++) {
//			num  = arr[i];
//			int count=0;
//			for(int j=0;j<n;j++) {
//				if(num==arr[j]) {
//					count++;
//				}
//			}
//			if(count == 1) {
//				return num;
//			}
//		}
//		return -1;
		
		// better approach (can use HashMap also)
//		LinkedHashMap<Integer, Integer> freq = new LinkedHashMap<>();
//
//        for (int num : arr) {
//            freq.put(num, freq.getOrDefault(num, 0) + 1);
//        }
//
//        for (int num : arr) {
//            if (freq.get(num) == 1) {
//                return num;
//            } 
//        }
//
//        return -1;
		
		// optimal approach
		 int xorr = 0;
	        for (int i = 0; i < n; i++) {
	            xorr = xorr ^ arr[i];
	        }
	        return xorr;
		
	}

}
