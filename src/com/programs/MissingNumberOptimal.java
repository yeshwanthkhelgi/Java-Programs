package com.programs;

public class MissingNumberOptimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,5};
		System.out.println(missingNumber(arr,5));

	}

	private static int missingNumber(int[] arr,int k) {
		// TODO Auto-generated method stub
		int xor1 = 0;
		int xor2 = 0;
		int n = arr.length;
//		for(int i=1;i<=k;i++) {
//			xor1 = xor1^i;
//		}
		for(int i=0;i<n;i++) {
			xor2 = xor2^arr[i];
			xor1 = xor1^(i+1);
		}
		xor1 = xor1^k;
		return xor1^xor2;
	}

}
