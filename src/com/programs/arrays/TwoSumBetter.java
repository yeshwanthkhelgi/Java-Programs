package com.programs.arrays;

import java.util.HashMap;

public class TwoSumBetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,6};
        int target = 8;
        int start = -1;
        int end = -1;
        int sum = 0;
        int k = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int j=0;j<arr.length;j++) {
        	map.put(arr[j], j);
        }
        for(int i=0;i<arr.length;i++) {
        	k = target - arr[i];
        	
        	if(map.containsKey(k)) {
        		start = i;
        		end = map.get(k);
        		break;
        	}
        	
        }
        
        System.out.println(start + " " + end);
	}

}
