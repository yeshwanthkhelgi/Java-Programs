package com.programs.stack;

public class Stack {
	
	private int[] arr = new int[5];
	int top;
	int size;
	
	public Stack() {
		size = arr.length;
		top = -1;
		
	}

	public void push(int data) {
		// TODO Auto-generated method stub
		top++;
		if(top<size) {
			arr[top] = data;
		}
		else {
			System.out.println("Stack Overflow.");
		}
		
		
	}

	public int pop() {
		// TODO Auto-generated method stub
		if(top > -1) {
			return arr[top--];
		}
		else {
			System.out.println("Stack Underflow.");
		}
		return 0;
		
	}
	
	public int peek() {
		// TODO Auto-generated method stub
		return arr[top];
		
	}
	
	public void printStack() {
		for(int n: arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	
	
}
