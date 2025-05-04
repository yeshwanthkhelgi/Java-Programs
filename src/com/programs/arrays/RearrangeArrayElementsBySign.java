package com.programs.arrays;

import java.util.ArrayList;

public class RearrangeArrayElementsBySign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, -4, -5, 3, 4};
		int[] ans = rearrangeArrayElementsBySign(arr);
		
		for (int i = 0; i < arr.length; i++) {
		    System.out.print(ans[i]+" ");
		  }
	}

	private static int[] rearrangeArrayElementsBySignOptimal(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int posIndex = 0, negIndex = 1;
		int[] ans = new int[n];
		for(int num : arr) {
			if(num<0) {
				ans[negIndex] = num;
				negIndex += 2;
			}
			else {
				ans[posIndex] = num;
				posIndex += 2;
			}
		}
		return ans;
	}

	private static int[] rearrangeArrayElementsBySign(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int i = 0, p = 0, ne = 0;
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();
		for(int num : arr) {
			if(num>0) {
				pos.add(num);
			}
			else {
				neg.add(num);
			}
		}
		while(p<pos.size() && ne<neg.size()) {
			arr[i++] = pos.get(p++);
			arr[i++] = neg.get(ne++);
		}
		
		while (p < pos.size()) {
            arr[i++] = pos.get(p++);
        }

        while (ne < neg.size()) {
            arr[i++] = neg.get(ne++);
        }
		return arr;
	}

}
