package com.programs.doublylinkedlist;

import java.util.Arrays;
import java.util.List;

public class DeleteAllOccurencesOfKeyInDLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = Arrays.asList(10, 4, 10, 10, 6, 10);
		DoublyLinkedList dll = new DoublyLinkedList();
		Node head = dll.convertArrayToDoublyLinkedList(arr);
		head = deleteAllOccurencesOfKeyInDLL(head,10);
		dll.printDLL(head);

	}

	private static Node deleteAllOccurencesOfKeyInDLL(Node head, int k) {
		// TODO Auto-generated method stub
		Node temp = head;
		while(temp != null) {
			Node nextNode = temp.next;
			Node prevNode = temp.back;
			if(temp.data == k) {
				if(temp ==  head) {
					head = nextNode;
					if (head != null) {
	                    head.back = null;
	                }
				}
				else {
					prevNode.next = nextNode;
					if(nextNode != null) {
						nextNode.back = prevNode;
					}
				}
			}
			temp = temp.next;
		}
		return head;
	}
	
	

}
