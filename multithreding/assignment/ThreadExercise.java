package com.multithreding.assignment;

import java.util.logging.Level;
import java.util.logging.Logger;

class Account {
	public static Account account;
	private static int balance = 1000;
	private static Person person;

	private Account() {}

	public static Account getAccount(Person p) {
		if (account == null) {
			account = new Account();
		}
		Account.person = p;
		return account;
	}

	public static int getBal() {
		return balance;
	}

	public synchronized void withdraw(int bal) {
		try {
			if (balance >= bal) {
				System.out.println(person.getName() + " " + "is try to withdraw");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				balance = balance - bal;
				System.out.println(person.getName() + " " + "is complete the withdraw");
			} else {
				System.out.println(person.getName() + " " + "doesn't have enough money for withdraw ");
			}
			System.out.println(person.getName() + " " + " withdraw Rs." + bal + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized void deposit(int bal) {
		try {
			if (bal > 0) {
				System.out.println(person.getName() + " " + " is try to deposit");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				balance = balance + bal;
				System.out.println(person.getName() + " " + "is complete the deposit");
			} else {
				System.out.println(person.getName() + " " + "doesn't have enough money for deposit");
			}
			System.out.println(person.getName() + " " + " deposit Rs." + bal + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class ThreadExercise extends Thread implements Runnable {

	private Person person;

	public ThreadExercise(Person p) {
		this.person = p;
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadExercise ts1 = new ThreadExercise(new Person("person 1"));
		ts1.start();
		
		//ts1.join();
		ThreadExercise ts2 = new ThreadExercise(new Person("person 2"));
		ts2.start();
		
		//ts2.join();
		
		ThreadExercise ts3 = new ThreadExercise(new Person("person 3"));
		ts3.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			try {
				Account acc = Account.getAccount(person);
				acc.withdraw(200);
				try {
					Thread.sleep(500);
				} catch (InterruptedException ex) {
					Logger.getLogger(ThreadExercise.class.getName()).log(Level.SEVERE, null, ex);
				}
				
				if (acc.getBal() < 0) {
					System.out.println("account is overdrawn!");
				}
				acc.deposit(200);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Final Acc balance is Rs." + Account.getBal());
	}
}

class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}