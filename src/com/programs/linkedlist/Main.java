package com.programs.linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		
		list.add(8);
		list.add(9);
		list.add(10);
		list.addElementAtStart(7);
		
		list.delete(10);
		list.checkIfPresent(8);
		list.printValues();
		list.length();

	}

}
