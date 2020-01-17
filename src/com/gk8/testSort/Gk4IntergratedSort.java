package com.gk8.testSort;

import java.time.chrono.MinguoChronology;
import java.util.Arrays;

public class Gk4IntergratedSort {

	public static void main(String[] args) {

		int[] toSort = { 30, 10, 50, 20 };
		System.out.println("Before Sort: " + Arrays.toString(toSort));
		/*
		int[] bubbleSort = bubbleSortAlgo(toSort);
		System.out.println("Using Bubble Sort: " + Arrays.toString(bubbleSort));
*/
		int[] selectionSort = selectionSortAlgo(toSort);
		System.out.println("Using selection Sort: " + Arrays.toString(selectionSort));
	}

	private static int[] selectionSortAlgo(int[] toSort) {

		for (int i = 0; i < toSort.length - 1; i++) {

			int assumeMinValueIndex = i;

			for (int j = i + 1; j < toSort.length; j++) {

				if (toSort[j] < toSort[assumeMinValueIndex]) {
					assumeMinValueIndex = j;
				}
			}

			if (assumeMinValueIndex != i) {
				// swap:
				int temp = toSort[i];
				toSort[i] = toSort[assumeMinValueIndex];
				toSort[assumeMinValueIndex] = temp;
			}
		}

		return toSort;
	}

	private static int[] bubbleSortAlgo(int[] toSort) {

		int lengthOfArray = toSort.length;

		for (int i = 0; i < lengthOfArray - 1; i++) {

			for (int j = 0; j < lengthOfArray - 1 - i; j++) {

				if (toSort[j] > toSort[j + 1]) {
					// swap:
					int temp = toSort[j];
					toSort[j] = toSort[j + 1];
					toSort[j + 1] = temp;
				}

			}
		}

		return toSort;
	}

}
