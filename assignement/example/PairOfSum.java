package com.assignement.example;

public class PairOfSum {

	public static void findThePairs(int inputArray[], int inputNumber) {
		for (int i = 0; i < inputArray.length; i++) {
			int remains = inputNumber - inputArray[i];

			if (remains + inputArray[i] == inputNumber) {
				System.out.println(remains + " + " + inputArray[i] + " = " + inputNumber);
			}
		}
	}

	public static void getPairsCount(int[] arr, int sum) 
    { 
  
        int count = 0;// Initialize result 
  
        // Consider all possible pairs and check their sums 
        for (int i = 0; i < arr.length; i++) 
            for (int j = i + 1; j < arr.length; j++) 
                if ((arr[i] + arr[j]) == sum) {
                    count++; 
                    System.out.println(arr[i] + " + " + arr[j] + " = "+ sum);
                }
        System.out.printf("Count of pairs is %d",count); 
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 6, 5, -10, 8, 5, 20 };
		int sum = 10;
		findThePairs(arr, sum);
		
		System.out.println("\n");
		
		getPairsCount(arr, sum);
	}
}
