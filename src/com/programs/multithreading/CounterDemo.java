package com.programs.multithreading;

/*Only one thread at a time can execute increment() due to the synchronized keyword.
 * This prevents multiple threads from reading and updating count simultaneously.
 */


public class CounterDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment(); 
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount()); // Expected: 20000
	}

}
