package com.programs.doublylinkedlist;

public class Node {
	int data;
	Node next;
	Node back;
	
	public Node(int data, Node next1, Node back1) {
		super();
		this.data = data;
		this.next = next1;
		this.back = back1;
	}

	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
		this.back = null;
	}
	
	
	
	

}
