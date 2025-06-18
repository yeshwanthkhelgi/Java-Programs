package com.programs.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class OddAndEvenIndexedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(2);
        l1.next.next.next.next = new ListNode(5);
        l1.next.next.next.next.next = new ListNode(6);

        OddAndEvenIndexedList test = new OddAndEvenIndexedList();
        ListNode result = test.oddAndEvenIndexedListOptimal(l1);

        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.data);
            if (result.next != null) System.out.print(" -> ");
            result = result.next;
        }
	}

	private ListNode oddAndEvenIndexedListOptimal(ListNode head) {
		// TODO Auto-generated method stub
		if(head == null || head.next == null) {
			return head;
		}
		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenHead = even;
		while(even != null && even.next != null) {
			odd.next = odd.next.next;
			odd = odd.next;
			
			even.next = even.next.next;
			even = even.next;
		}
		odd.next = evenHead;
		return head;
	}

	private ListNode oddAndEvenIndexedList(ListNode head) {
		// TODO Auto-generated method stub
		if(head == null || head.next == null) {
			return head;
		}
		List<Integer> list = new ArrayList<>();
		ListNode temp = head;
		while(temp != null && temp.next != null) {
			list.add(temp.data);
			temp = temp.next.next;
		}
		if(temp != null) {
			list.add(temp.data);
		}
		temp = head.next;
		while(temp != null && temp.next != null) {
			list.add(temp.data);
			temp = temp.next.next;
		}
		if(temp != null) {
			list.add(temp.data);
		}
		temp = head;
		int i=0;
		while(temp != null) {
			temp.data = list.get(i);
			i++;
			temp = temp.next;
		}
		
		return head;
	}

}
