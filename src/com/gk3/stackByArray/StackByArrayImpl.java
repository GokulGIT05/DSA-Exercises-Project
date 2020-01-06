package com.gk3.stackByArray;

import java.util.Arrays;

public class StackByArrayImpl {

	private int topOfStack;
	private int[] arrayValues;

	// 1. Array Creation
	public StackByArrayImpl(int sizeOfArray) {
		super();
		this.arrayValues = new int[sizeOfArray];
		this.topOfStack = -1;
	}

	// 2. Push Operation
	public void pushStack(int value) {
		if (isArrayIsEmptyOrFull()) {
			System.out.println("Push Operation can't be performed..");
		} else {
			arrayValues[topOfStack + 1] = value;
			topOfStack++;
		}
	}

	public boolean isArrayIsEmptyOrFull() {
		if (arrayValues.length - 1 == topOfStack) {
			return true;
		} else
			return false;
	}

	public void popStack() {

		if (isArrayIsEmptyOrFull()) {
			System.out.println("Stack is Empty..");
			return;
		} else {
			System.out.println("The Value is pop is: " + arrayValues[topOfStack]);
			arrayValues[topOfStack] = 0;
			topOfStack--;
		}
	}

	public void peekStack() {
		// This will just show the top of Array.

		System.out.println("The Peek value is: " + arrayValues[topOfStack]);

	}

	public void deleteArray() {

		arrayValues = null;
		topOfStack= -1;

	}

	@Override
	public String toString() {
		return "StackByArrayImpl [topOfArray=" + topOfStack + ", arrayValues=" + Arrays.toString(arrayValues) + "]";
	}

}
