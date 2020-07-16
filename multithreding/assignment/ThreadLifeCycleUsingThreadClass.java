package com.multithreding.assignment;

public class ThreadLifeCycleUsingThreadClass extends Thread {
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroyed");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(i);
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println("Started");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadLifeCycleUsingThreadClass th = new ThreadLifeCycleUsingThreadClass();
		
		th.run();
		
		th.start();
	}
}
