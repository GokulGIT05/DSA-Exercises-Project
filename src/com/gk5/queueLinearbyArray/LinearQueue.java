package com.gk5.queueLinearbyArray;

import java.util.Arrays;

public class LinearQueue {

	int[] queueArrayVal;
	int topOfQueue; // this will point to last value in queue.
	int beginingOfQueue; // Use in Dequeue Operation.

	public void createQueue(int sizeOfArray) {
		queueArrayVal = new int[sizeOfArray];
		topOfQueue = beginingOfQueue = -1;
	}

	public void enqueueOperation(int valueToInsert) {

		queueArrayVal[topOfQueue + 1] = valueToInsert;
		topOfQueue++;

	}

	@Override
	public String toString() {
		return "LinearQueue [queueArrayVal=" + Arrays.toString(queueArrayVal) + ", topOfQueue=" + topOfQueue
				+ ", beginingOfQueue=" + beginingOfQueue + "]";
	}

	public void dequeueOperation() {

		System.out.println("First-In value " + queueArrayVal[beginingOfQueue + 1] + " is dequeued.");
		queueArrayVal[beginingOfQueue + 1] = 0;
		beginingOfQueue++;
	}

	public void deleteQueue() {

		queueArrayVal = null;
		topOfQueue = -1;
		beginingOfQueue = -1;
	}
}
