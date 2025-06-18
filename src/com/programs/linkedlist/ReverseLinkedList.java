package com.programs.linkedlist;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        
        printLL(l1);
        ReverseLinkedList test = new ReverseLinkedList();
        ListNode result = test.reverseLinkedListRecursive(l1);
        printLL(result);
	}
	
	private ListNode reverseLinkedListRecursive(ListNode head) {
		// TODO Auto-generated method stub
		if(head == null || head.next == null) {
			return head;
		}
		ListNode newHead = reverseLinkedListRecursive(head.next);
		ListNode front = head.next;
		front.next = head;
		head.next = null;
		return newHead;
	}

	private ListNode reverseLinkedList(ListNode head) {
		// TODO Auto-generated method stub
		ListNode temp = head;
		ListNode prev = null;
		while(temp != null) {
			ListNode front = temp.next;
			temp.next = prev;
			prev = temp;
			temp = front;
		}
		return prev;
	}

	private static void printLL(ListNode head) {
		// TODO Auto-generated method stub
		
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
		
	}

}
