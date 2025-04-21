package com.programs.arrays;

public class ArmstrongNumber {
	
	public static void checkArmstrongNumber(int n) {
		int temp = n;
		int r,sum=0;
		while(n>0) {
			r = n%10;
			sum = sum + r*r*r;
			n = n/10;
		}
		if(temp==sum) {
			System.out.println(temp + " is a armstrong number");
		}
		else {
			System.out.println(temp + " is not a armstrong number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkArmstrongNumber(153);
		checkArmstrongNumber(152);

	}

}
