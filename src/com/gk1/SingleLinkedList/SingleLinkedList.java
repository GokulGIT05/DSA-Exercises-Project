package com.gk1.SingleLinkedList;

import java.time.LocalDate;

public class SingleLinkedList {

	SLLNode headNode;
	SLLNode tailNode;
	int nodeSize;

	// 1. Creation Operation
	public SLLNode createSingleLinkedList(int ValueInNode) {

		// 1. New head Node is created.
		headNode = new SLLNode();

		SLLNode newNode = new SLLNode();
		newNode.setValue(ValueInNode);

		headNode = newNode;
		tailNode = newNode;
		nodeSize = 1;
		return tailNode;
	}

	// 2. Traverse Operation
	public void traverseSLL() {

		if (headNode != null) {

			SLLNode tempNode = headNode;

			for (int i = 0; i < nodeSize; i++) {
				System.out.println("Value of Node: " + tempNode.getValue());
				tempNode = tempNode.getNextNode();
			}
		} else {
			System.out.println("The Given Linked List is empty");
		}

	}

	// 3. Insertion Operation.
	public void insertNode(int Value, int Location) {

		if (headNode == null) {
			return;
		}

		SLLNode nodeToInserted = new SLLNode();
		nodeToInserted.setValue(Value);

		// Insert at First Location
		if (Location == 0) {
			nodeToInserted.setNextNode(headNode);
			headNode = nodeToInserted;
		} else if (Location > nodeSize) { // Insert at last
			nodeToInserted.setNextNode(null);
			tailNode.setNextNode(nodeToInserted);
			tailNode = nodeToInserted;
		} else {
			// Insert at any location except head and tail.
			SLLNode tempNode = headNode;

			int eachNodeLoc = 0;
			while (eachNodeLoc < Location - 1) {
				tempNode = tempNode.getNextNode(); // Traversing to get the previous node of new node insertion
				eachNodeLoc++;
			}

			nodeToInserted.setNextNode(tempNode.getNextNode());
			tempNode.setNextNode(nodeToInserted);
		}

		nodeSize++; // Because new node is inserted.
	}

	public void searchValueInLL(int searchvalue) {

		if (headNode == null) {
			return;
		}

		SLLNode tempNode = headNode;

		for (int i = 0; i < nodeSize; i++) {

			if (searchvalue == tempNode.getValue()) {
				System.out.println("The value is found in " + tempNode);
				return;
			}
			tempNode = tempNode.getNextNode();

		}

		System.out.println("The Given Value is not found in LinkedList");

	}

	public void deleteNodeAtGivenLocation(int deleteLocation) {

		if (headNode == null) {
			System.out.println("Linked List is empty. So no node is deleted.");
			return;
		}

		// Deleting the head node.
		if (deleteLocation == 0) {
			SLLNode tempNode = headNode.getNextNode();
			headNode = tempNode;
			nodeSize--;
			if (headNode == null) {
				tailNode = null;
			}
		} else if (deleteLocation > nodeSize) { // Deleting the tail node.
			System.out.println("Deleting Tail Node");
			SLLNode tempNode = headNode;
			for (int i = 0; i < nodeSize - 1; i++) {
				tempNode = tempNode.getNextNode();
			}

			tempNode.setNextNode(null);
			tailNode = tempNode;
			nodeSize--;
			if (tailNode == null) {
				headNode = null;
			}

		} else {
			// Deleting Intermediate node.
			SLLNode tempNode = headNode;
			for (int i = 0; i < deleteLocation - 1; i++) {
				tempNode = tempNode.getNextNode();
			}

			tempNode.setNextNode(tempNode.getNextNode().getNextNode());
			nodeSize--;
		}
	}

	public void deleteLinkedList() {
		System.out.println("Deleting an entire Linked List");
		headNode = null;
		tailNode = null;
		nodeSize = 0;
	}
}
