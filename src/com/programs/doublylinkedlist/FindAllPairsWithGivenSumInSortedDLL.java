package com.programs.doublylinkedlist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllPairsWithGivenSumInSortedDLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 9);
		DoublyLinkedList dll = new DoublyLinkedList();
		Node head = dll.convertArrayToDoublyLinkedList(arr);
		findAllPairsWithGivenSumInSortedDLLOptimal(head,5);
		

	}

	private static void findAllPairsWithGivenSumInSortedDLLOptimal(Node head, int k) {
		// TODO Auto-generated method stub
		Node temp1 = head;
		Node temp2 = head;
		Map<Integer,Integer> map = new HashMap<>();
		while(temp2.next != null) {
			temp2 = temp2.next;
		}
		while(temp1.data < temp2.data) {                       // TC = O(2N)
			if((temp1.data + temp2.data) > k) {
				temp2 = temp2.back;
			}
			else if((temp1.data + temp2.data) < k) {
				temp1 = temp1.next;
			}
			else {
				map.put(temp1.data, temp2.data);
				temp1 = temp1.next;
				temp2 = temp2.back;
			}
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " , " + entry.getValue());
		}
	}

	private static void findAllPairsWithGivenSumInSortedDLLBruteForce(Node head, int k) {
		// TODO Auto-generated method stub
		Node temp1 = head;
		Map<Integer,Integer> map = new HashMap<>();
		while(temp1 != null) {
			Node temp2 = temp1.next;
			while(temp2 != null && (temp1.data+temp2.data) <= k) {                // TC near about O(N*N)
				int sum = temp1.data + temp2.data;
				if(sum == k) {
					map.put(temp1.data, temp2.data);
				}
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
			
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " , " + entry.getValue());
		}
		
	}

}
