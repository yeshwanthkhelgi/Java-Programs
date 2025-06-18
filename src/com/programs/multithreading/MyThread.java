package com.programs.multithreading;

public class MyThread extends Thread{
	
	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
        try {
            System.out.println("State in run(): " + this.getState()); // RUNNABLE
            Thread.sleep(1000); // Makes thread enter TIMED_WAITING state
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
	
}
