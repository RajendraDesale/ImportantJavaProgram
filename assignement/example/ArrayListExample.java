package com.assignement.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();

		list.add("Rajendra");
		list.add("Rajendra");

		list.add("Amol");
		list.add("Nimisha");
		list.add("mangesh");
		list.add("Rupa");
		list.add("naresh");

		System.out.println(list);

		list.remove(4);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		for (String string : list) {
			System.out.println("Test " + string);
		}

		list.forEach(a -> System.out.println("Test 2 " + a));

		System.out.println("\n");
		
		// Creating user-defined class objects
		Student s1 = new Student(101, "Rajendra", 28);
		Student s2 = new Student(102, "Amol", 26);
		Student s3 = new Student(103, "Nimisha", 26);
		
		// creating arraylist
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);// adding Student class object
		al.add(s2);
		al.add(s3);
		
		// Getting Iterator
		Iterator<Student> itr1 = al.iterator();
		
		// traversing elements of ArrayList object
		while (itr1.hasNext()) {
			Student st = (Student) itr1.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}

class Student {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}
