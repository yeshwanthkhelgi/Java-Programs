package com.programs.arrays;

import java.util.Arrays;

public class TwoSumOptimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,6};
        int target = 6;
        int start = 0;
        int end = arr.length-1;
        int sum = 0;
        int k = 0;
        
        Arrays.sort(arr);
        
        while(start<end) {
        	if(arr[start] + arr[end] > target) {
        		end--;
        	}
        	else if(arr[start] + arr[end] < target) {
        		start++;
        	}
        	else {
        		break;
        	}
        }
        System.out.println(start + " " + end);
	}

}
