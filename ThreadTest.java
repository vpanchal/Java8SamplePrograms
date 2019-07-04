package com.java;

public class ThreadTest {

	public static void main(String[] args) {
		new ThreadTest1("eBay").start();
		new ThreadTest1("Paypal").start();
		new ThreadTest1("Google").start();
	}
}
	
	class ThreadTest1 extends Thread {
		public ThreadTest1(String str) {
			super(str);
		}
	 
		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println("Loop " + i + ": " + getName());
				try {
					sleep((int) (Math.random() * 2000));
				} catch (InterruptedException e) {
				}
			}
			System.out.println("Test Finished for: " + getName());
		}
	}
