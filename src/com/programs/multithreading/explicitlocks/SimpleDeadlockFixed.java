package com.programs.multithreading.explicitlocks;

public class SimpleDeadlockFixed {

    static final Object pen = new Object();
    static final Object paper = new Object();

    public static void main(String[] args) {

        Thread writer1 = new Thread(() -> {
            synchronized (pen) {
                System.out.println("Writer 1: Holding pen...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (paper) {
                    System.out.println("Writer 1: Got paper and writing...");
                }
            }
        });

        Thread writer2 = new Thread(() -> {
            synchronized (pen) { // 🔑 Lock in same order: pen → paper
                System.out.println("Writer 2: Holding pen...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (paper) {
                    System.out.println("Writer 2: Got paper and writing...");
                }
            }
        });

        writer1.start();
        writer2.start();
    }
}

