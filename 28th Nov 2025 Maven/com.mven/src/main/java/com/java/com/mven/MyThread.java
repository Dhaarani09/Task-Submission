package com.java.com.mven;

import java.util.Iterator;

public class MyThread extends Thread{
	
	public void run() {
		System.out.println("Thread " + this.getName() + "running");
		for(int i=0;i<=5;i++) {
			System.out.println(this.getName() + "Value : " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MyThread t =new MyThread();
		MyThread t1 = new MyThread();
		t.start();
		t1.start();
	}

}
