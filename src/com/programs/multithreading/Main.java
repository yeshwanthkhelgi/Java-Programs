package com.programs.multithreading;
/*join() is a method used to pause the current thread 
 * (usually the main thread) until the thread t has finished 
 * execution.
 * 
 * Thread.sleep() is used to pause the execution of the current 
 * thread for a specified period of time.
 */
public class Main {

	public static void main(String[] args) {
        MyThread t = new MyThread("yeshwanth");
        System.out.println("State after creation: " + t.getState()); // NEW

        t.start();
        System.out.println("State just after start(): " + t.getState()); // RUNNABLE

        try {
            Thread.sleep(100); // Small delay to let thread enter sleep()
            System.out.println("State during sleep in run(): " + t.getState()); // TIMED_WAITING

            t.join(); // Wait for thread to finish
            System.out.println("State after completion: " + t.getState()); // TERMINATED
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
