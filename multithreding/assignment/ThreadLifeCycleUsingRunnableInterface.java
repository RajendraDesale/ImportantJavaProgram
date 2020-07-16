package com.multithreding.assignment;

public class ThreadLifeCycleUsingRunnableInterface implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				try {
					System.out.println(i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ThreadLifeCycleUsingRunnableInterface th = new ThreadLifeCycleUsingRunnableInterface();

		Thread thread = new Thread(th);

		Thread thread1 = new Thread(th);

		Thread thread2 = new Thread(th);

		Thread thread3 = new Thread(th);

		thread.start();
		thread.join();
		
		thread1.start();
		thread1.join();
		
		thread2.start();
		thread2.join();
		
		thread3.start();
	}
}
