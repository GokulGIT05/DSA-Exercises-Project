package com.gk7.sortAlgorithms;

public class Gk2SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 10, 5, 30, 15, 50, 6 };
		printArray(arr);

		arr = selectionSortAlgo(arr);
		
		printArray(arr);
	}

	private static int[] selectionSortAlgo(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int minValIndex = i; // assumed first index is the min value.

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[minValIndex]) {
					minValIndex = j;
				}
			} // End of Inner Loop.

			if (minValIndex != i) { // index we choose is not changed means
				// Swap.
				int temp = arr[minValIndex];
				arr[minValIndex] = arr[i];
				arr[i] = temp;
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
