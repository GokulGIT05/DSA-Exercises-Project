package com.gk4.stackByLinkedList;

public class StackLinkedList {
	
	LinkedListNode head;
	
	LinkedListNode tail;
	
	int sizeOfLinkedList; // Size is need to traverse the list.
	
	// 1. Create operation
	public void createLinkedListStack(int value) {
		LinkedListNode firstNode = new LinkedListNode();
		
		head =firstNode;
		head.setValue(value);
		head.setNextNode(null);
		tail = head;
		sizeOfLinkedList = 1;
	}
	
	// 2. Push Operation.
	public LinkedListNode pushOperation(int Value) {
		
		LinkedListNode nodeToBeInserted = new LinkedListNode();
		nodeToBeInserted.setValue(Value);
		nodeToBeInserted.setNextNode(head);
		head = nodeToBeInserted;
		sizeOfLinkedList++;

		return head;
	}
	
	// 3. Pop Operation.
	
	public LinkedListNode popOperation() {
		
		System.out.println(head.getValue() + " is going to Poped");
		head = head.getNextNode();
		sizeOfLinkedList--;
		
		return head;
		
	}
	
	public void deleteStack() {
		head = null;
		tail = null;
		sizeOfLinkedList=0;
	}
	
	

}
