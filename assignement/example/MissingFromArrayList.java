package com.assignement.example;

public class MissingFromArrayList {

	public static void MissingFromList(int[] arr) {

		int[] register = new int[100];

		for (int i : arr) {
			register[i] = 1;
		}

		System.out.println("missing numbers in given array");

		for (int i = 1; i < register.length; i++) {
			if (register[i] == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 6, 5, -10, 8, 5, 20 };

		MissingFromList(arr);
	}
}
