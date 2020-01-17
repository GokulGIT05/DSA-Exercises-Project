package com.gk8.testSort;

import java.util.Arrays;

public class Gk2SelectionSort {

	public static void main(String[] args) {

		int[] toSort = { 30, 20, 50, 15 };

		System.out.println(Arrays.toString(toSort));

		int[] sortedArray = selectionSort(toSort);
		System.out.println(Arrays.toString(sortedArray));

	}

	private static int[] selectionSort(int[] toSort) {

		// two arrays, assume first array is sorted and second array is unsorted.

		for (int i = 0; i < toSort.length - 1; i++) {

			int minValueIndex = i; // First element in unsorted array is min like that am assuming.

			for (int j = i + 1; j < toSort.length; j++) {

				if (toSort[j] < toSort[minValueIndex]) {
					minValueIndex = j;
				}
			} // End of this loop will find min value in unsorted array.
			
			// Checking our assumption and result are same.
			if( minValueIndex != i) {
				// swap:
				int temp = toSort[i];
				toSort[i] = toSort[minValueIndex];
				toSort[minValueIndex] = temp;
			}

		}

		return toSort;
	}

}
