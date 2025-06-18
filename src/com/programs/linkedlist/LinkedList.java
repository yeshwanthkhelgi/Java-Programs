package com.programs.linkedlist;

public class LinkedList {
	
	Node head = null;

	
	public void add(int data) {
		Node newNode = new Node(data);
		
		Node mover = head;
		if(head == null) {
			head = newNode;
		}
		else {
			while(mover.next!=null) {
				mover = mover.next;
			}
			mover.next = newNode;
		}
//		System.out.println(head);
		
}


	public void printValues() {
		// TODO Auto-generated method stub
		
		Node mover = head;
		while(mover != null) {
			System.out.print(mover.data + " ");
			mover = mover.next;
		}
		System.out.println();
		
	}


	public void addElementAtStart(int data) {
		// TODO Auto-generated method stub
//		System.out.println(head);
		Node newNode = new Node(data);
		
		newNode.next = head;
		head = newNode;
		
	}


	public void delete(int data) {
		// TODO Auto-generated method stub
		if (head == null) return; // empty list

	    if (head.data == data) {
	        head = head.next; // delete head
	        return;
	    }
		Node mover = head;
		while(mover.next != null && mover.next.data != data) {
			mover = mover.next;
		}
		
		if(mover.next != null) {
			
			mover.next = mover.next.next;
			
		}
	}
	
	


	public void length() {
		// TODO Auto-generated method stub
		Node mover = head;
		int count = 0;
		while(mover != null) {
			mover = mover.next;
			count++;
		}
		System.out.println(count);
		
	}


	public void checkIfPresent(int val) {
		// TODO Auto-generated method stub
		Node mover = head;
		int index = 0;
		while(mover != null) {
			index++;
			if(mover.data == val) {
				System.out.println("present at " + (index - 1));
				return;
			}
			mover = mover.next;
			
		}
		System.out.println("not present");
		
	}
	
}
