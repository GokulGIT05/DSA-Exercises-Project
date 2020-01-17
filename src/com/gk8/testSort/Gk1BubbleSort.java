package com.gk8.testSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gk1BubbleSort {

	public static void main(String[] args) {

		List<Integer> toSort = new ArrayList<Integer>();
		toSort.add(30);
		toSort.add(10);
		toSort.add(50);

		System.out.println("Before Sort: " + toSort);

		int[] sortedValue = bubbleSortAlgorithm(toSort);
		System.out.println("Sorted Value: " + Arrays.toString(sortedValue));

	}

	private static int[] bubbleSortAlgorithm(List<Integer> toSort) {

		int[] valToSort = new int[toSort.size()];
		System.out.println("Arrays.toString(valToSort): " + Arrays.toString(valToSort));

		// Converted Integer Collection to primitiveIntArray
		for (int i = 0; i < toSort.size(); i++) {
			valToSort[i] = toSort.get(i);
		}
		System.out.println("Arrays.toString(valToSort): " + Arrays.toString(valToSort));

		// Bubble Sort Algorithm Starts.

		for (int i = 0; i < valToSort.length - 1; i++) { // Responsible to find biggest number.

			for (int j = 0; j < valToSort.length - 1 - i; j++) { //

				if (valToSort[j] > valToSort[j + 1]) {
					int temp = valToSort[j];
					valToSort[j] = valToSort[j + 1];
					valToSort[j + 1] = temp;
				}
			}
		}

		return valToSort;
	}

}
