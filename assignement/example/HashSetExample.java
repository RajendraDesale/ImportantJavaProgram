package com.assignement.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<>();
		
		set.add("Rajendra");
		set.add("Rajendra");

		set.add("Amol");
		set.add("Nimisha");
		set.add("mangesh");
		
		set.add("ganesh");
		
		set.add("Rupa");
		set.add("naresh");
		
		set.add("ganesh");
		
		Set<String> set1 = new LinkedHashSet<String>();
		set1.add("Rajendra");
		set1.add("Rajendra");

		set1.add("Amol");
		set1.add("Nimisha");
		set1.add("mangesh");
		
		set1.add("ganesh");
		
		set1.add("Rupa");
		set1.add("naresh");
		
		set1.add("ganesh");
		
		Set<String> set3 = new TreeSet<String>();
		set3.add("Rajendra");
		set3.add("Rajendra");

		set3.add("Amol");
		set3.add("Nimisha");
		set3.add("mangesh");
		
		set3.add("ganesh");
		
		set3.add("Rupa");
		set3.add("naresh");
		
		set3.add("ganesh");
		
		System.out.println(set3);
		System.out.println("\n");
		System.out.println(set1);
		System.out.println("\n");
		System.out.println(set);

		set.add("Test1");
		set1.add("Test1");
		set3.add("Test1");
		
		System.out.println(set3);
		System.out.println("\n");
		System.out.println(set1);
		System.out.println("\n");
		System.out.println(set);
		
		set.remove(4);

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	} 

}
