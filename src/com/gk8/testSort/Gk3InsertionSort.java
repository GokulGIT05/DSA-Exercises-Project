package com.gk8.testSort;

import java.util.Arrays;

public class Gk3InsertionSort {

	public static void main(String[] args) {

		int[] toSort = { 30, 20, 50, 10 };
		System.out.println(Arrays.toString(toSort));

		int[] sortedArray = insertionSort(toSort);
		System.out.println(Arrays.toString(sortedArray));
	}

	private static int[] insertionSort(int[] toSort) {

		for (int i = 1; i < toSort.length; i++) { // Am starting from index 1. So it should only be less than

			int firstEltInUnSortedArray = toSort[i];
			int j = i;

			while (j > 0 && (toSort[j - 1] > firstEltInUnSortedArray)) {
				// Putting the element in sorted array as a first element.
				toSort[j] = toSort[j - 1];
				j--;

			}

			toSort[j] = firstEltInUnSortedArray;

		}

		return toSort;
	}

}
