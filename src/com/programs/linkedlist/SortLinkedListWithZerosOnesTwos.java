package com.programs.linkedlist;

import java.util.HashMap;

public class SortLinkedListWithZerosOnesTwos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
        l1.next = new ListNode(0);
        l1.next.next = new ListNode(1);
        l1.next.next.next = new ListNode(2);
        l1.next.next.next.next = new ListNode(0);
        l1.next.next.next.next.next = new ListNode(2);
        l1.next.next.next.next.next.next = new ListNode(1);
        printLL(l1);
        SortLinkedListWithZerosOnesTwos test = new SortLinkedListWithZerosOnesTwos();
        ListNode result = test.sortLinkedListWithZerosOnesTwosOptimal(l1);
        printLL(result);

        
        
        
	}
	
	private ListNode sortLinkedListWithZerosOnesTwosOptimal(ListNode head) {
		// TODO Auto-generated method stub
		if(head == null || head.next == null) {
			return head;
		}
		ListNode temp = head;
		ListNode l_0 = new ListNode(-1);
		ListNode zeroHead = l_0;
		ListNode l_1 = new ListNode(-1);
		ListNode oneHead = l_1;
		ListNode l_2 = new ListNode(-1);
		ListNode twoHead = l_2;
		
		while(temp != null) {
			if(temp.data == 0) {
				l_0.next = temp;
				l_0 = l_0.next;
			}
			else if(temp.data == 1) {
				l_1.next = temp;
				l_1 = l_1.next;
			}
			else {
				l_2.next = temp;
				l_2 = l_2.next;
			}
			temp = temp.next;
		}
		l_0.next = oneHead.next != null ? oneHead.next : twoHead.next;
		l_1.next = twoHead.next;
		l_2.next = null;
		return zeroHead.next;
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

	private ListNode sortLinkedListWithZerosOnesTwosBruteForce(ListNode head) {
		// TODO Auto-generated method stub
		int count_0 = 0;
		int count_1 = 0;
		int count_2 = 0;
		ListNode temp = head;
		
		while(temp != null) {
			if(temp.data == 0) {
				count_0++;
			}
			else if(temp.data == 1) {
				count_1++;
			}
			else {
				count_2++;
			}
			temp = temp.next;
		}
		temp = head;
		for(int i=0;i<count_0;i++) {
			temp.data = 0;
			temp = temp.next;
		}
		for(int i=0;i<count_1;i++) {
			temp.data = 1;
			temp = temp.next;
		}
		for(int i=0;i<count_2;i++) {
			temp.data = 2;
			temp = temp.next;
		}
		return head;
	}

}
