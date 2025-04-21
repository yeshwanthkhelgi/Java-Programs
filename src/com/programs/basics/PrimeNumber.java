package com.programs.basics;

public class PrimeNumber {
	
	public static void checkPrimeNumber(int n) {
		int m = n/2;
		int flag = 0;
		if(n==0 || n==1) {
			System.out.println(n + " is not prime number");
		}
		else {
		for(int i=2;i<=m;i++) {
			if(n%i == 0) {
				flag = 1;
				System.out.println(n + " is not prime number");
				break;
			}
		}
		if(flag==0) {
			System.out.println(n + " is prime number");
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPrimeNumber(3);
		checkPrimeNumber(4);
		checkPrimeNumber(7);

	}

}
