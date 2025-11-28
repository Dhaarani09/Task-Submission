package com.java.com.mven;

public class RunnableDemo implements Runnable {

    Thread t;

    // Constructor
    public RunnableDemo() {
        // Pass 'this' to the Thread so that this run() method is executed
        t = new Thread(this);
        t.start();  // Start the thread
    }

    @Override
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        // Create an instance to start the thread
        new RunnableDemo();
    }
}
