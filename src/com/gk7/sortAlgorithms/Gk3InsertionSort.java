package com.gk7.sortAlgorithms;

public class Gk3InsertionSort {

	public static void main(String[] args) {
		int arrayVal[] = { 40, 30, 5 ,1};
		printArray(arrayVal);
		System.out.println();

		arrayVal = insertionSortAlgo(arrayVal);
		printArray(arrayVal);
	}

	private static int[] insertionSortAlgo(int[] arrayVal) {

		for (int i = 1; i < arrayVal.length; i++) {

			int firstEltInUnsortedArray = arrayVal[i];
			int j = i;

			while (j > 0 && arrayVal[j - 1] > firstEltInUnsortedArray) {
				arrayVal[j] = arrayVal[j - 1]; // arrayVal[j] is like sorted array.
				j--;
			}
			arrayVal[j] = firstEltInUnsortedArray;

		}

		return arrayVal;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}//
}
