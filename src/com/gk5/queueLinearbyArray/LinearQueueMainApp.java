package com.gk5.queueLinearbyArray;

public class LinearQueueMainApp {

	public static void main(String[] args) {
		
		LinearQueue lQueueObj = new LinearQueue();
		
		// 1. Creating a Queue.
		lQueueObj.createQueue(5);
		System.out.println(lQueueObj);
		
		// 2. enqueue Operation
		lQueueObj.enqueueOperation(15);
		lQueueObj.enqueueOperation(25);
		lQueueObj.enqueueOperation(35);
		System.out.println(lQueueObj);
		
		// 3. Dequeue operation.
		lQueueObj.dequeueOperation();
		lQueueObj.dequeueOperation();
		System.out.println(lQueueObj);
		
		// 4. Deleting a queue.
		lQueueObj.deleteQueue();
		System.out.println(lQueueObj);

	}

}
