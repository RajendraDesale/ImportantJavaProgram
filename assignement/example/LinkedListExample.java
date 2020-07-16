package com.assignement.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<String>();

		list.add("Rajendra");
		list.add("Rajendra");

		list.add("Amol");
		list.add("Nimisha");
		list.add("mangesh");
		
		list.add("ganesh");
		
		list.add("Rupa");
		list.add("naresh");
		
		list.add("ganesh");

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
		Student1 s1 = new Student1(101, "Rajendra", 28);
		Student1 s2 = new Student1(102, "Amol", 26);
		Student1 s3 = new Student1(103, "Nimisha", 26);

		// creating arraylist
		LinkedList<Student1> al = new LinkedList<Student1>();
		al.add(s1);// adding Student class object
		al.add(s2);
		al.add(s3);
		
		Student1 s4 = new Student1(103, "Nimisha", 26);
		al.add(s4);
		
		// Getting Iterator
		Iterator<Student1> itr1 = al.iterator();

		// traversing elements of ArrayList object
		while (itr1.hasNext()) {
			Student1 st = (Student1) itr1.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
		Collections.sort(al);
	}
}

class Student1 implements Comparable<Student1>{
	int rollno;
	String name;
	int age;

	Student1(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollno != other.rollno)
			return false;
		return true;
	}

	@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}
