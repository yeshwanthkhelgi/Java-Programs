package com.programs;

import java.util.HashMap;
import java.util.Map;

public class FrequenceElements {
	
	public static void frequenceElements(int[] a) {
		HashMap<Integer,Integer> map = new HashMap<>();
		// Count frequency using HashMap
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map.keySet());
        
        for (Integer key : map.keySet()) {
            System.out.println(key + " → " + map.get(key) + " times");
        }

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1,2,3,3,2,1};
		frequenceElements(arr);

	}

}
