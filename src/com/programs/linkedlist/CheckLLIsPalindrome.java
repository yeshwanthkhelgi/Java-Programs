package com.programs.linkedlist;

public class CheckLLIsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(3);
        l1.next.next.next.next = new ListNode(2);
        l1.next.next.next.next.next = new ListNode(1);
        
        printLL(l1);
        CheckLLIsPalindrome test = new CheckLLIsPalindrome();
        boolean result = test.checkLLIsPalindrome(l1);
        System.out.println(result);
	}

	private boolean checkLLIsPalindrome(ListNode head) {
		// TODO Auto-generated method stub
		if(head == null || head.next == null) {
			return true;
		}
		ListNode fast = head;
		ListNode slow = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode newHead = reverseLinkedList(slow.next);
		ListNode first = head;
		ListNode second = newHead;
		while(second != null) {
			if(first.data != second.data) {
				reverseLinkedList(newHead);
				return false;
			}
			first = first.next;
			second = second.next;
		}
		reverseLinkedList(newHead);
		return true;
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

}
