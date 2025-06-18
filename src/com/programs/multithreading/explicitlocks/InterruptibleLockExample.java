package com.programs.multithreading.explicitlocks;

import java.util.concurrent.locks.ReentrantLock;

public class InterruptibleLockExample {

	private final ReentrantLock lock = new ReentrantLock();

    public void performTask() {
        try {
            System.out.println(Thread.currentThread().getName() + " trying to acquire lock...");
            lock.lockInterruptibly(); // Interruptible
            try {
                System.out.println(Thread.currentThread().getName() + " acquired lock.");
                Thread.sleep(5000); // simulate long task
            } finally {
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + " released lock.");
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted while waiting for the lock.");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        InterruptibleLockExample example = new InterruptibleLockExample();

        Thread t1 = new Thread(example::performTask, "T1");
        Thread t2 = new Thread(example::performTask, "T2");

        t1.start();
        Thread.sleep(100); // Make sure T1 locks first
        t2.start();

        Thread.sleep(1000); // Wait a bit, then interrupt T2
        t2.interrupt();     // 🚨 Interrupt the second thread
    }

}
