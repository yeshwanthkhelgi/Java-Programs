package com.programs.linkedlist;

import java.util.HashMap;

public class IntersectionPointOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Common part (shared by both lists)
		ListNode common = new ListNode(8);
		common.next = new ListNode(10);

		// List 1: 3 → 7 → 8 → 10
		ListNode head1 = new ListNode(3);
		head1.next = new ListNode(7);
		head1.next.next = common;

		// List 2: 99 → 1 → 8 → 10 (intersection starts at 8)
		ListNode head2 = new ListNode(99);
		head2.next = new ListNode(1);
		head2.next.next = common;


        
        IntersectionPointOfLinkedList test = new IntersectionPointOfLinkedList();
        ListNode result = test.intersectionPointOfLinkedListOptimal(head1,head2);
        printLL(result);

	}

	private ListNode intersectionPointOfLinkedListOptimal(ListNode head1, ListNode head2) {
		// TODO Auto-generated method stub
		ListNode temp1 = head1;
	    ListNode temp2 = head2;

	    while (temp1 != temp2) {
	        temp1 = (temp1 == null) ? head2 : temp1.next;
	        temp2 = (temp2 == null) ? head1 : temp2.next;
	    }

	    return temp1;
	}

	private ListNode intersectionPointOfLinkedListBetter(ListNode head1, ListNode head2) {
		// TODO Auto-generated method stub
		ListNode t1 = head1;
		int n1 = 0;
		while(t1 != null) {
			n1++;
			t1 = t1.next;
		}
		ListNode t2 = head2;
		int n2 = 0;
		while(t2 != null) {
			n2++;
			t2 = t2.next;
		}
		if(n1 < n2) {
			return collisionPoint(head1,head2,n2-n1); // head1 < head2 in terms of length
		}
		else {
			return collisionPoint(head2,head1,n1-n2); // head1 > head2 in terms of length
		}
		
	}

	private ListNode collisionPoint(ListNode smallHead, ListNode LargeHead, int d) {
		// TODO Auto-generated method stub
		while(d != 0) {
			d--;
			LargeHead = LargeHead.next;
		}
		
		while(smallHead != LargeHead) {
			smallHead = smallHead.next;
			LargeHead = LargeHead.next;
		}
		return smallHead; // or LargeHead
		
	}

	private ListNode intersectionPointOfLinkedList(ListNode head1, ListNode head2) {
		// TODO Auto-generated method stub
		HashMap<ListNode,Integer> map = new HashMap<>();
		ListNode temp = head1;
		while(temp != null) {
			map.put(temp, 1);
			temp = temp.next;
		}
		temp = head2;
		while(temp != null) {
			if(map.containsKey(temp)) {
				ListNode newHead = temp;
				return newHead;
			}
			temp = temp.next;
		}
		System.out.println("no intersection");
		return null;
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
