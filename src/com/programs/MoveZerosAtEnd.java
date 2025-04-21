package com.programs;

import java.util.ArrayList;

public class MoveZerosAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,0,4,6,0,0,1,0,4};
		moveZerosAtEnd(arr);

	}

	private static void moveZerosAtEnd(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		ArrayList<Integer> hash = new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(arr[i] != 0) {
				hash.add(arr[i]);
			}
		}
		
		for(int j=0;j<hash.size();j++) {
			arr[j] = hash.get(j);
		}
		
		for(int k=hash.size();k<n;k++) {
			arr[k] = 0;
		}
		
		for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
		
	}

}
