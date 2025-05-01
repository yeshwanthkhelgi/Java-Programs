package com.programs.arrays;

import java.util.ArrayList;

public class MoveZerosAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,0,4,6,0,0,1,0,4};
		moveZerosAtEndOptimal(arr);

	}
	
	private static void moveZerosAtEndOptimal(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int j = -1;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				j = i;
				break;
			}
		}
		
        if (j == -1) {
        	for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

		int temp = 0;
		
		for(int i=j+1;i<n;i++) {
			if(arr[i] != 0) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
		
		
	}

	private static void moveZerosAtEndBruteForce(int[] arr) {
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
