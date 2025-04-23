package com.programs.queue;

public class Queue {
	
	private int[] arr = new int[5];
	int front = 0;
	int rear = -1;
	int size = 0; 
	
	public void enqueue(int data) {
		if(!isFull()) {
			rear = (rear + 1) % 5;
			arr[rear] = data;
			size++;
		}
		else {
			System.out.println("Queue is full.");
		}
	}
	
	public boolean isFull() {
		return size==5;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is empty.");
		}
		int data = arr[front];
		front = (front + 1) % 5;
		size--;
		return data;
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is empty.");
		}
		int data = arr[front];
		return data;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void printStack() {
	    int count = size;
	    int i = front;

	    while (count > 0) {
	        System.out.print(arr[i] + " ");
	        i = (i + 1) % 5; // wrap around if needed
	        count--;
	    }
	    System.out.println();
	}
}
