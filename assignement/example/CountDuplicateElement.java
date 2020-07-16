package com.assignement.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 1, 2, 3, 4, 5, 6, 7, 8, 8 };
		Map<Integer,Integer> map = new HashMap<>();
		
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				int value =  map.get(array[i]);
				value = value +1;
				map.put(array[i], value);
			} else {
				map.put(array[i], 1);
			}
		}
		
		 for (Map.Entry mapElement : map.entrySet()) {
	            String key = (String)mapElement.getKey(); 
		 }
	  
		System.out.println(map);
	}
}
