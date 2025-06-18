package com.programs.linkedlist;

import java.util.Arrays;
import java.util.List;

public class LinkedList1 {
	
	public void deleteNode(ListNode node) {
        if (node == null || node.next == null) return; 
        
        node.data = node.next.data;       
        node.next = node.next.next;     
    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> arr = Arrays.asList(12, 8, 5, 7, 2);
		 ListNode head = convertArrayToLinkedList(arr); // 12 8 5 7 2
	     head = insertHead(head, 10); // 10 12 8 5 7 2
	     head = removesHead(head);  // 12 8 5 7 2
	     head = removesTail(head); // 12 8 5 7
	     head = deleteGivenKTHElement(head,3); // delete 5 (12 8 7)
	     head = removeValue(head,12); // 8 7
	     head = insertAtLast(head,12); // 8 7 12
	     head = insertAtGivenKTHElement(head,3,9); // 8 7 9 12
	     head = insertElementBeforeValueX(head,3,9); // 8 7 3 9 12
	     printLL(head);
	     length(head);


	}

	private static ListNode convertArrayToLinkedList(List<Integer> arr) {
		// TODO Auto-generated method stub
		if (arr == null || arr.isEmpty()) {
	        return null; // Return null for empty or null list
	    }

	    ListNode head = new ListNode(arr.get(0));
	    ListNode current = head;

	    for (int i = 1; i < arr.size(); i++) {
	        current.next = new ListNode(arr.get(i));
	        current = current.next;
	    }
//		ListNode head = new ListNode(arr.get(0));
//	     head.next = new ListNode(arr.get(1));
//	     head.next.next = new ListNode(arr.get(2));
//	     head.next.next.next = new ListNode(arr.get(3)); // 12 8 5 7
//	     head.next.next.next.next = new ListNode(arr.get(4)); // 12 8 5 7 2
		return head;
	}

	private static ListNode insertElementBeforeValueX(ListNode head, int val, int x) {
		// TODO Auto-generated method stub
		if (head == null) {
	        return head; // Empty list
	    }
		ListNode mover = head;
		if(head.data == x) {
			return new ListNode(val, head);
		}
		while(mover.next != null && mover.next.data != x) {
			mover = mover.next;
		}
		if (mover.next == null) {
	        System.out.println("Value " + x + " not found in the list.");
	        return head;
	    }
		ListNode node = new ListNode(val);
		// node.next = mover.next
		// mover.next = node;
		ListNode temp = mover.next;
		mover.next = node;
		node.next = temp;
		return head;
	}

	private static ListNode insertAtGivenKTHElement(ListNode head, int k,int val) {
		// TODO Auto-generated method stub
		if (k <= 0) {
	        System.out.println("Invalid position");
	        return head;
	    }
		ListNode node = new ListNode(val);
		if (head == null) {
			head = node;
	        return head; // Empty list
	    }
		if(k==1) {
			node.next = head;
			head = node;
			return head;
		}
		int count = 1;
		ListNode mover = head;
		while(count < k-1 && mover.next != null) {
			mover = mover.next;
			count++;
		}
		if (mover == null) {
	        System.out.println("Position exceeds list length.");
	        return head;
	    }
		ListNode temp = mover.next;
		mover.next = node;
		node.next = temp;
		return head;
	}

	private static ListNode insertAtLast(ListNode head, int val) {
		// TODO Auto-generated method stub
		if (head == null) {
	        return new ListNode(val); // Empty list
	    }
		ListNode mover = head;
		while(mover.next != null) {
			mover = mover.next;
		}
		ListNode node = new ListNode(val);
		mover.next = node;
		return head;
	}

	private static ListNode removeValue(ListNode head, int data) {
		// TODO Auto-generated method stub
		if (head == null) {
	        return head; // Empty list
	    }
		if(head.data == data) {
			head = head.next;
			return head;
		}
		ListNode mover = head;
		while(mover.next != null && mover.next.data != data) {
			mover = mover.next;
		}
        if(mover.next != null) {
			
			mover.next = mover.next.next;
			
		}
		
		return head;
	}

	private static ListNode deleteGivenKTHElement(ListNode head, int k) {
	    if (head == null) {
	        return head; // Empty list
	    }

	    if (k == 1) {
	        return head.next; // Delete first node
	    }

	    ListNode mover = head;
	    int count = 1;

	    // Move to (k-1)th node
	    while (mover != null && count < k - 1) {
	        mover = mover.next;
	        count++;
	    }

	    // If mover is null or mover.next is null, k is out of bounds
	    if (mover == null || mover.next == null) {
	        return head;
	    }
	    // Skip the kth node
	    mover.next = mover.next.next;

	    return head;
	}


	private static void length(ListNode head) {
//	    if (head == null) {
//	        System.out.println("empty list");
//	        return;
//	    }

	    int count = 0;
	    ListNode mover = head;
	    while (mover != null) {
	        count++;
	        mover = mover.next;
	    }
	    System.out.println("length : " + count);
	}

	private static ListNode removesTail(ListNode head) {
		// TODO Auto-generated method stub
		// 12 3 4 5 6
		if(head==null || head.next==null) {
			return null;
		}
		ListNode mover = head;
		while(mover.next.next != null) {
			mover = mover.next;
		}
		mover.next = null;
		return head;
	}

	private static ListNode removesHead(ListNode head) {
		// TODO Auto-generated method stub
		// 12 3 4 5 6
		if(head==null) {
			return head;  // empty list
		}
		head = head.next;
		return head;
	}

	private static void printLL(ListNode head) {
		// TODO Auto-generated method stub
		while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
		System.out.println();
		
	}

	private static ListNode insertHead(ListNode head, int val) {
		// TODO Auto-generated method stub
		ListNode temp = new ListNode(val, head);
        return temp;
	}

}
