package com.programs.arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		System.out.println(missingNumber(arr,5));

	}
	
	private static int missingNumberXor(int[] arr,int k) {
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

	private static int missingNumber(int[] arr,int k) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int sum = k*(k+1)/2;
		int s = 0;
		for(int a:arr) {
			s = s + a;
		}
		return sum - s;
	}

}
