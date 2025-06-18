package com.programs.multithreading;

/*Thread.yield() is a static method used to suggest to the thread scheduler 
   that the current thread is willing to pause its execution to allow other 
   threads of equal priority a chance to run.
   It's only a hint to the scheduler, not a guarantee.
*/


public class YieldDemo extends Thread {
    public YieldDemo(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);
            Thread.yield();  // Hint: Let other threads run
        }
    }
    
    public static void main(String[] args) {
        YieldDemo t1 = new YieldDemo("Thread-A");
        YieldDemo t2 = new YieldDemo("Thread-B");

        t1.start();
        t2.start();
    }
}
