package com.programs.lambaexpressions;

public class SumTwoNumbers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		int b = 9;
		SumCalculator sumCalculate = (x,y) -> x+y;
		System.out.println(sumCalculate.sum(a, b));
		
		

	}

	
	

}
