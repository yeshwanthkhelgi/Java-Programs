package com.programs.stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack nums = new Stack();
		
		nums.push(10);
		nums.push(30);
		System.out.println(nums.pop());
		nums.push(70);
		nums.push(20);
		System.out.println(nums.peek());
		nums.push(50);
		nums.push(90);
		
		nums.printStack();
	}

}
