package com.concurrencypackage.assignment;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// define capacity of ArrayBlockingQueue
		int capacity = 5;

		// create object of Bounded LinkedBlockingQueue
		LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<String>(capacity);

		// Add elements to LinkedBlockingQueue using put method
		queue.put("StarWars");
		queue.put("SuperMan");
		queue.put("Flash");
		queue.put("BatMan");
		queue.put("Avengers");

		// print Queue
		System.out.println("queue contains " + queue);

		// remove some elements
		queue.remove();
		queue.remove();

		// Add elements to LinkedBlockingQueue
		// using put method
		queue.put("CaptainAmerica");
		queue.put("Thor");

		System.out.println("queue contains " + queue);
		
		// create object of UnBounded LinkedBlockingQueue
		LinkedBlockingQueue<String> queue1 = new LinkedBlockingQueue<String>();

		// Add elements to LinkedBlockingQueue using put method
		queue1.put("StarWars");
		queue1.put("SuperMan");
		queue1.put("Flash");
		queue1.put("BatMan");
		queue1.put("Avengers");

		// print Queue
		System.out.println("queue contains 1" + queue1);

		// remove some elements
		queue1.remove();
		queue1.remove();

		// Add elements to LinkedBlockingQueue
		// using put method
		queue1.put("CaptainAmerica");
		queue1.put("Thor");

		System.out.println("queue contains 1" + queue1);
	}
}
