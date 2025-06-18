package com.programs.multithreading;
/*
 * A daemon thread is a background thread that runs behind the scenes and 
 * does not prevent the JVM from exiting when all user (non-daemon) threads finish.
 * JVM shuts down automatically once all user threads are done — even if daemon threads are still running.
 * Examples of Daemon Threads: Garbage Collector, Finalizer, Background tasks like monitoring, logging, etc.
 */
public class DaemonDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread daemon = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread running...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    break;
                }
            }
            
        });

        daemon.setDaemon(true); // Set it as daemon
        daemon.start();

        // Main thread sleeps for 2 seconds then ends
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished");
	}

	

}
