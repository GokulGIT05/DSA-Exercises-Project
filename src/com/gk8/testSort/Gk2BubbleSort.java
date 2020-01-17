package com.gk8.testSort;

import java.util.Arrays;

public class Gk2BubbleSort {

	public static void main(String[] args) {

		int[] toSortArray = { 30, 10, 50, 20, 15 };
		System.out.println(Arrays.toString(toSortArray));

		int[] sortedArray = bubbleSortAlgorithm(toSortArray);
		System.out.println(Arrays.toString(sortedArray));

	}

	private static int[] bubbleSortAlgorithm(int[] toSortArray) {

		int lengthOfArray = toSortArray.length;

		for (int outer = 0; outer < lengthOfArray - 1; outer++) {
			// Outer loop to go one by one elements in an array.

			// inner loop will find the biggest elements in array and put it in last index.
			for (int inner = 0; inner < lengthOfArray - 1 - outer; inner++) {

				if (toSortArray[inner] > toSortArray[inner + 1]) {
					// Swap:
					int temp = toSortArray[inner];
					toSortArray[inner] = toSortArray[inner + 1];
					toSortArray[inner + 1] = temp;
				}

			}
		}

		return toSortArray;
	}

}
