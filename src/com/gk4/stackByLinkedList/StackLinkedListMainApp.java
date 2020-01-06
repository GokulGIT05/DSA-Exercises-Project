package com.gk4.stackByLinkedList;

public class StackLinkedListMainApp {

	public static void main(String[] args) {
		
		StackLinkedList stackObj = new StackLinkedList();
		
		// 1. Create LinkedList
		stackObj.createLinkedListStack(5);
		
		// 2. Push Operation.
		stackObj.pushOperation(15);
		stackObj.pushOperation(25);
		System.out.println(stackObj.head.getNextNode().getNextNode());
		System.out.println(stackObj.head.getNextNode());
		System.out.println(stackObj.head);
		
		// stack Pop Operation.
		stackObj.popOperation();
		System.out.println(stackObj.head);
		
		
		// Delete Operation
		stackObj.deleteStack();
		System.out.println(stackObj.head);

	}

}
