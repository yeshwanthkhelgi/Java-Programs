package com.programs.multithreading;
/*
 * Thread.interrupt() is used to interrupt a thread — it sets an internal 
 * "interrupted" flag on the target thread.
 * This is commonly used to politely stop a thread that is sleeping, waiting, or running a long task.
 * 
 * What it does:
 * If the thread is in:
 * sleep(), wait(), or join() → it throws an InterruptedException.
 * Running normally → it just sets the interrupted status flag (true), which the thread can check manually.
 */
public class InterruptDemo extends Thread{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		InterruptDemo t = new InterruptDemo();
        t.start();

        Thread.sleep(2500); // Let the thread run for a while

        t.interrupt(); // Interrupts the thread during sleep

	}

	@Override
	public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Working: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted during sleep");
        }
        System.out.println("Thread exiting...");
    }

}
