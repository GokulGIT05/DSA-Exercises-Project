package com.gk7.sortAlgorithms;

public class Gk1BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 10, 5, 30, 15, 50, 6 };
		printArray(arr);

		System.out.println("After Sort");

		arr = bubbleSortAlgo(arr);
		printArray(arr);

	}

	private static int[] bubbleSortAlgo(int[] arr) {

		int lengthOfArray = arr.length;

		for (int i = 0; i < lengthOfArray - 1; i++) { // To first to Last Cell
			for (int j = 0; j < lengthOfArray - 1 - i; j++) { // Compare Value from First to last - 1 Cell.
				// Swap Function
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}

		return arr;
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
