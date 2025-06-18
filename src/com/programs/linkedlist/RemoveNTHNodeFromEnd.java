package com.programs.linkedlist;

public class RemoveNTHNodeFromEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        
        printLL(l1);
        RemoveNTHNodeFromEnd test = new RemoveNTHNodeFromEnd();
        ListNode result = test.removeNTHNodeFromEndOptimal(l1,5);
        printLL(result);
	}
	
	private ListNode removeNTHNodeFromEndOptimal(ListNode head, int n) {
		// TODO Auto-generated method stub
		ListNode fast = head;
		for(int i=0;i<n;i++) {
			fast = fast.next;
		}
		if(fast == null) {
			return head.next;
		}
		ListNode slow = head;
		while(fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return head;
	}

	private ListNode removeNTHNodeFromEnd(ListNode head, int n) {
		// TODO Auto-generated method stub
		if(head == null || head.next == null) {
			return null;
		}
		ListNode temp = head;
		int cnt = 0;
		while(temp != null) {
			cnt++;
			temp = temp.next;
		}
		if(cnt == n) {
			return head.next;
		}
		int res = cnt - n;
		temp = head;
		while(temp != null) {
			res--;
			if(res == 0) {
				break;
			}
			temp = temp.next;
		}
		temp.next = temp.next.next;
		return head;
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
