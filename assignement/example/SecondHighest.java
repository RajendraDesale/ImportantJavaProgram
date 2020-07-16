package com.assignement.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighest {


	public static void secondHighest(int[] arr) {
		
		int highest = Integer.MIN_VALUE;
		int second_highest = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] > highest) {
				second_highest = highest;
				highest = arr[i];
			} else if (arr[i] > second_highest  && arr[i] != highest ) {
				second_highest = arr[i];
			}
		}
		
		List<Integer> list = new ArrayList<>();
		
		for (Integer i : arr) {
			list.add(i);
		}
		
		Collections.sort(list,Collections.reverseOrder());
		
		System.out.println(list);
		
		System.out.println("Highest " + highest);
		
		System.out.println("Second Highest " + second_highest);
	}
	
	public static void secondLowest(int[] arr) {
		int lowest = Integer.MAX_VALUE;
		int second_lowest = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] < lowest) {
				second_lowest = lowest;
				lowest = arr[i];
			} else if (arr[i] < second_lowest  && arr[i] != lowest) {
				second_lowest = arr[i];
			}
		}
		
		List<Integer> list = new ArrayList<>();
		
		for (Integer i : arr) {
			list.add(i);
		}
		
		Collections.sort(list);
		
		System.out.println(list);
		
		System.out.println("Lowest " + lowest);
		
		System.out.println("Second Lowest " + second_lowest);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 6, 5, 10, 8, 5, 20 };

		secondHighest(arr);
		
		secondLowest(arr);
	}
}
