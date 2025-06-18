package com.programs.linkedlist;

public class AddOneToLL {
	
	static int carry;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        
        printLL(l1);
        AddOneToLL test = new AddOneToLL();
        ListNode result = test.addOneToLLRecursive(l1);
        printLL(result);

	}

	private ListNode addOneToLLRecursive(ListNode head) {
		// TODO Auto-generated method stub
	    carry = 1; // We want to add 1
	    int carry = addOneHelper(head);

	    // If there's a leftover carry, add a new node at the head
	    if (carry != 0) {
	        ListNode newNode = new ListNode(carry);
	        newNode.next = head;
	        return newNode;
	    }

	    return head;
	}
	
	private int addOneHelper(ListNode head) {
	    if (head == null) {
	        return 1;
	    }

	    carry = addOneHelper(head.next);

	    int sum = head.data + carry;
	    head.data = sum % 10;
	    carry = sum / 10;

	    return carry;
	}

	private ListNode addOneToLL(ListNode head) {
		// TODO Auto-generated method stub
		head = reverseLinkedList(head);
		ListNode temp = head;
		int carry = 1; // carry can be n (adding n to the LL)
		while(temp != null) {
			int sum = temp.data + carry;
			temp.data = sum % 10;
			carry = sum / 10;
			if(carry == 0) {
				break;
			}
			temp = temp.next;
		}
		head = reverseLinkedList(head); 
		if(carry != 0) {
			ListNode newNode = new ListNode(carry);
			newNode.next = head;
			return newNode;
			
		}
		 
		return head;
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
