package com.programs.multithreading.explicitlocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * outerMethod() acquires the lock.
 * innerMethod() is called from the same thread, and it tries to acquire the 
 * same lock again.
 * ReentrantLock is reentrant — the same thread can acquire the lock multiple times.
 */

public class ReentrantExample {
	
	private final Lock lock = new ReentrantLock();
	
	public void outerMethod() {
		lock.lock();
		try {
			System.out.println("Outer method");
			innerMethod();
		}
		finally {
			System.out.println("Outer method lock is released");
			lock.unlock();
		}
	}

	public void innerMethod() {
		lock.lock();
		try {
			System.out.println("Inner method");
		}
		finally {
			System.out.println("Inner method lock is released");
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReentrantExample example = new ReentrantExample();
		example.outerMethod();

	}

}
