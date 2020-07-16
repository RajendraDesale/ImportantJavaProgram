package com.multithreding.assignment;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample implements Runnable {
	String name;
	ReentrantLock re;

	public ReentrantLockExample(ReentrantLock re, String name) {
		super();
		this.name = name;
		this.re = re;
	}

	public void run() {
		boolean done = false;
		while (!done) {
			// Getting Outer Lock
			boolean ans = re.tryLock();

			// Returns True if lock is free
			if (ans) {
				try {
					Date d = new Date();
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
					System.out.println(
							"task name - " + name + " outer lock acquired at " + ft.format(d) + " Doing outer work");
					Thread.sleep(1500);

					// Getting Inner Lock
					re.lock();
					try {
						d = new Date();
						ft = new SimpleDateFormat("hh:mm:ss");
						System.out.println("task name - " + name + " inner lock acquired at " + ft.format(d)
								+ " Doing inner work");
						System.out.println("Lock Hold Count - " + re.getHoldCount());
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						// Inner lock release
						System.out.println("task name - " + name + " releasing inner lock");

						re.unlock();
					}
					System.out.println("Lock Hold Count - " + re.getHoldCount());
					System.out.println("task name - " + name + " work done");

					done = true;
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					// Outer lock release
					System.out.println("task name - " + name + " releasing outer lock");

					re.unlock();
					System.out.println("Lock Hold Count - " + re.getHoldCount());
				}
			} else {
				System.out.println("task name - " + name + " waiting for lock");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		final int MAX_T = 2;

		ReentrantLock rel = new ReentrantLock();
		ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

		Runnable w1 = new ReentrantLockExample(rel, "Job1");
		Runnable w2 = new ReentrantLockExample(rel, "Job2");
		Runnable w3 = new ReentrantLockExample(rel, "Job3");
		Runnable w4 = new ReentrantLockExample(rel, "Job4");

		pool.execute(w1);
		pool.execute(w2);
		pool.execute(w3);
		pool.execute(w4);
		pool.shutdown();
	}
}
