package com.assignement.example;

public class CommonFromArray {

	public static void commonElements(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {// inner loop
				if (a[i] == b[j]) {
					System.out.println(a[i]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 6, 5, -10, 8, 5, 20 };

		int[] arr1 = { 4, 7, 0, -10, 1, 3, 20 };

		commonElements(arr, arr1);
	}
}
