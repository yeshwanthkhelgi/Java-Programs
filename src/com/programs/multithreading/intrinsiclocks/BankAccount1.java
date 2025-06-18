package com.programs.multithreading.intrinsiclocks;

/*The entire method is locked for 10 seconds (due to sleep), which blocks all other threads.
 * Even read-only or unrelated tasks (like checking balance) can’t proceed.
 */

public class BankAccount1 {
	
	private int balance = 100;
	
	public synchronized void withdraw(int amount) {
		 System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
		 
		 if (balance >= amount) {
	            System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
	            try {
		            Thread.sleep(10000); // simulate DB
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
	            balance -= amount;
	            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining: " + balance);
	        } else {
	            System.out.println(Thread.currentThread().getName() + " insufficient balance");
	        }

		
	}

}
