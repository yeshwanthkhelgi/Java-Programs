package com.programs.doublylinkedlist;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DoublyLinkedList {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = Arrays.asList(12, 8, 5, 7, 2);
		Node head = convertArrayToDoublyLinkedList(arr);
//		head = deleteHead(head);
//		head = deleteTail(head);
//		head = deleteGivenKTHElement(head,5);
//		deleteGivenNode(head.next);
//		head = insertBeforeHead(head,10);
//		head = insertBeforeTail(head,6);
		head = reverseDLLOptimal(head);
		printDLL(head);
		
		

	}

	private static Node reverseDLLOptimal(Node head) {
		// TODO Auto-generated method stub
		if (head == null) return null;
		Node current = head;
		Node last = null;
		while(current != null) {
			last = current.back;
			current.back = current.next;
			current.next = last;
			current = current.back;
		}
		head = last.back;
		return head;
	}

	private static Node reverseDLL(Node head) {
		// TODO Auto-generated method stub
		if (head == null) return null;
		Stack<Integer> st = new Stack<>();
		Node temp = head;
		while(temp != null) {
			st.push(temp.data);
			temp = temp.next;
		}
		temp = head;
		while(temp != null) {                 // TC = O(2N), SC = O(N)
			temp.data = st.pop();
			temp = temp.next;
		}
		
		return head;
	}

	private static Node insertBeforeTail(Node head, int val) {
		// TODO Auto-generated method stub
		if(head.next == null) {
			return insertBeforeHead(head, val);
		}
		Node tail = head;
		while(tail.next != null) {
			tail = tail.next;
		}
		Node prev = tail.back;
		Node node = new Node(val,tail,prev);
		prev.next = node;
		tail.back = node;
		return head;
	}

	private static Node insertBeforeHead(Node head, int val) {
		// TODO Auto-generated method stub
		Node node = new Node(val,head,null);
		head.back = node;
		head = node;
		return head;
	}

	private static void deleteGivenNode(Node temp) {
		// TODO Auto-generated method stub
		Node prev = temp.back;
		Node front = temp.next;
		if(front == null) {
			prev.next = null;
			temp.back = null;
			return;
		}
		prev.next = front;
		front.back = prev;
		temp.next = null;
		temp.back = null;
	}

	private static Node deleteGivenKTHElement(Node head, int k) {
		// TODO Auto-generated method stub
		if(head == null) {
			return head;
		}
		// 12 8 5 7 2
		int count = 0;
		Node mover = head;
		while(mover != null) {
			count++;
			if(count == k) {
				break;
			}
			mover = mover.next;
		}
		if(mover == null) {
			System.out.println("Position " + k + " is out of bounds.");
			return head;
		}
		Node prev = mover.back;
	    Node front = mover.next;
	    if(prev == null && front == null) {
	    	return null;
	    }
	    else if(prev == null) {
	    	return deleteHead(head);
	    }
	    else if(front == null) {
	    	return deleteTail(head);
	    }
	    else {
	    	prev.next = front;
	    	front.back = prev;
	    	mover.next = null;
	    	mover.back = null;
	    }
		return head;
	}

	private static Node deleteTail(Node head) {
		// TODO Auto-generated method stub
		if(head == null) {
			return head;
		}
		if(head.next == null) {
			return null;
		}
		Node tail = head;
		while(tail.next != null) {
			tail = tail.next;
		}
		Node prev = tail.back;
		tail.back = null;
		prev.next = null;
		return head;
	}

	private static Node deleteHead(Node head) {
		// TODO Auto-generated method stub
		if(head == null) {
			return head;
		}
		if(head.next == null) {
			return null;
		}
		Node prev = head;
		head = head.next;
		head.back = null;
		prev.next = null;
		return head;
	}

	public static void printDLL(Node head) {
		// TODO Auto-generated method stub
		while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
		System.out.println();
		
	}

	public static Node convertArrayToDoublyLinkedList(List<Integer> arr) {
		// TODO Auto-generated method stub
		Node head = new Node(arr.get(0));
		Node prev = head;
		for(int i=1;i<arr.size();i++) {
			Node temp = new Node(arr.get(i),null,prev);
			prev.next = temp;
			prev = prev.next; // prev = temp
		}
		return head;
	}

}
