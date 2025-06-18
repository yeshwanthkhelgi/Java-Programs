package com.programs.multithreading.explicitlocks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*If both Thread 1 and Thread 2 try to withdraw at the same time:
 * Only one gets the lock within 1 second (1000ms).
 * That thread proceeds and holds the lock for 3 seconds.
 * The other thread might fail to acquire the lock and print:
 * "Thread X could not acquire the lock, will try later".
 * This avoids:
 * Starvation
 * Deadlocks
 * Blocking forever 
 */

public class BankAccount {
	
	private int balance = 100;
	
	private final Lock lock = new ReentrantLock();
	
	public void withdraw(int amount) {
	    System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
	    try {
	        if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
	            try {
	                if (balance >= amount) {
	                    System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
	                    Thread.sleep(3000); // simulate DB operation
	                    balance -= amount;
	                    System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining: " + balance);
	                } else {
	                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
	                }
	            } finally {
	                lock.unlock();  // ALWAYS release the lock
	            }
	        } else {
	            System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try later");
	        }
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt(); // Preserve the interrupt status
	        System.out.println(Thread.currentThread().getName() + " was interrupted during withdrawal.");
	    }
	}


}
