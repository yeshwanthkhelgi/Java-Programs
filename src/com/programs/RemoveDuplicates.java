package com.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1,5,2,3,4,2,3,4};
//		Arrays.sort(arr);
		int k = removeDuplicates(arr);
		for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

	}

	private static int removeDuplicates(int[] arr) {
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
