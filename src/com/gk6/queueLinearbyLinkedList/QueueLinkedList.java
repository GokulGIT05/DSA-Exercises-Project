package com.gk6.queueLinearbyLinkedList;

public class QueueLinkedList {

	LinkedListNode head;
	LinkedListNode tail;
	int sizeOfLinkedList;

	// 1. Create a Node.
	public LinkedListNode createLL(int firstValue) {
		LinkedListNode tempNode = new LinkedListNode();

		tempNode.setValue(firstValue);
		tempNode.setNextNode(null);

		head = tempNode;
		tail = tempNode;
		sizeOfLinkedList++;

		return head;
	}

	// 2. enqueue Operation.
	public LinkedListNode enqueueOperation(int valueToInsert) {

		LinkedListNode tempNode = new LinkedListNode();
		tempNode.setNextNode(null);
		tempNode.setValue(valueToInsert);

		tail.setNextNode(tempNode);
		tail = tempNode;
		sizeOfLinkedList++;

		return tail;

	}

	// 3. Dequeue Operation.
	public LinkedListNode dequeueOperation() {

		System.out.println("The Value to Dequeue is: " + head.getValue());

		head = head.getNextNode();
		
		sizeOfLinkedList--;

		return head;
	}
}
