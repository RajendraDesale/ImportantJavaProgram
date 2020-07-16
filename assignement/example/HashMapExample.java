package com.assignement.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(null, "TestNullKey");
		map.put(null, "TestNullKey1");
		map.put(1, "Rajendra");
		map.put(2, "Rajendra");

		map.put(3, "ganesh");
		map.put(4, "Ramesh");
		map.put(5, "Suresh");

		map.put(6, "Amol");
		map.put(7, "Nimisha");

		map.put(8, "Mahesh");
		map.put(9, null);
		
		System.out.println(map);
		
		Map<Integer, String> map1 = new LinkedHashMap<Integer, String>();

		map1.put(null, null);
		
		map1.put(null, "");
		
		map1.put(9, "");
		
		map1.put(1, "Rajendra");
		

		map1.put(3, "ganesh");
		map1.put(4, "Ramesh");
		map1.put(5, "Suresh");

		map1.put(6, "Amol");
		map1.put(7, "Nimisha");

		map1.put(2, "Rajendra");
		
		map1.put(8, "Mahesh");
		
		System.out.println(map1);
		
		Map<Integer, String> map2 = new TreeMap<Integer, String>();

		map2.put(10, null);
		
		map2.put(11, "");
		
		map2.put(9, "");
		
		map2.put(1, "Rajendra");

		map2.put(3, "ganesh");
		map2.put(4, "Ramesh");
		map2.put(5, "Suresh");

		map2.put(6, "Amol");
		map2.put(7, "Nimisha");

		map2.put(2, "Rajendra");
		
		map2.put(8, "Mahesh");

		System.out.println(map2);
	}
}
