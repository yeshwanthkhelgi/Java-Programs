package com.programs.multithreading.explicitlocks;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount sbi = new BankAccount();
		Runnable task = () -> {
			sbi.withdraw(50);
		};
		Thread t1 = new Thread(task,"Thread 1");
		Thread t2 = new Thread(task,"Thread 2");
		t1.start();
		t2.start();

	}

}
