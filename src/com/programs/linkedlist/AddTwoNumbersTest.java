package com.programs.linkedlist;

public class AddTwoNumbersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating dummy inputs: (342) => 2 -> 4 -> 3
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Creating dummy inputs: (465) => 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        AddTwoNumbersTest test = new AddTwoNumbersTest();
        ListNode result = test.addTwoNumbers(l1, l2);

        // Printing result (Expected: 7 -> 0 -> 8, which represents 807)
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.data);
            if (result.next != null) System.out.print(" -> ");
            result = result.next;
        }

	}

	public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        ListNode t1 = head1;
        ListNode t2 = head2;
        int carry = 0;
        ListNode dummyNode = new ListNode(-1);
        ListNode current = dummyNode;
        while(t1 != null || t2 != null){
            int sum = carry;
            if(t1 != null){
                sum += t1.data;
            }
            if(t2 != null){
                sum += t2.data;
            }
            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10;
            current.next = newNode;
            current = current.next;
            if(t1 != null){
                t1 = t1.next;
            }
            if(t2 != null){
                t2 = t2.next;
            }
        }
        if(carry != 0){
            ListNode newNode = new ListNode(carry);
            current.next = newNode;
        }
        return dummyNode.next;
    }

}
