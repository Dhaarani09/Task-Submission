package com.java.com.mven;

/**
 * Hello world!
 */
public class App{
	
	
	
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getId());
        System.out.println(thread.getPriority());
        System.out.println(thread.getState());
        System.out.println(thread.isAlive());
        System.out.println(thread.isDaemon());
        
        Thread t1 = new Thread("thread1");
        System.out.println(t1.getName());
        System.out.println(t1.getId());
        t1.setPriority(10);
        System.out.println(t1.getPriority());
        t1.start();
    }
}
