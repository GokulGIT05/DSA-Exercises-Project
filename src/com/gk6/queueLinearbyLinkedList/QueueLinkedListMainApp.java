package com.gk6.queueLinearbyLinkedList;

public class QueueLinkedListMainApp {

	public static void main(String[] args) {
		
		QueueLinkedList mainObj = new QueueLinkedList();
		
		// 1. Create
		mainObj.createLL(5);
		System.out.println(mainObj.head.getValue());
		
		// 2. Enqueue Operation.
		mainObj.enqueueOperation(15);
		mainObj.enqueueOperation(25);
		System.out.println(mainObj.tail.getValue());
		System.out.println(mainObj.tail.getNextNode());
		
		// 3. Dequeue operation.
		mainObj.dequeueOperation();
		System.out.println(mainObj.head.getValue());
		
		

	}

}
