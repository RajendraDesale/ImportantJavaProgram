package com.multithreding.assignment;

class ThreadExample {

	synchronized void print(int p ,int q) throws InterruptedException {
		for (int i = p; i < q; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}

class ThreadExample1 extends Thread {
	ThreadExample obj;
    int i, j;
	public ThreadExample1(ThreadExample obj,int i, int j) {
		this.obj = obj;
		this.i = i;
		this.j = j;
	}

	@Override
	public void run() {
		try {
			obj.print(i,j);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName());  
	}
}

public class SynchronizedMethodBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample obj1 = new ThreadExample();

		ThreadExample1 obj = new ThreadExample1(obj1,1,10);

		ThreadExample1 obj2 = new ThreadExample1(obj1,11,20);

		obj2.start();
		
		obj.start();
		
		System.out.println(obj.isAlive());
	}
}
