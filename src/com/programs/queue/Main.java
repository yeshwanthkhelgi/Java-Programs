package com.programs.queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		 queue.enqueue(10);
		 queue.enqueue(20);
		 queue.enqueue(30);
		 queue.enqueue(40);
		 queue.enqueue(50);
		 queue.dequeue();
		 queue.enqueue(60);
		 System.out.println(queue.peek());
		 queue.printStack();
	}

}
