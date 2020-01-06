package com.gk2.CircularSingleLinkedList;

import java.time.LocalDate;

public class CircularSingleLinkedList {

	CSLLNode headNode;
	CSLLNode tailNode;
	int nodeSize;

	// 1. Creation Operation
	public CSLLNode createSingleLinkedList(int ValueInNode) {

		// 1. New head Node is created.
		headNode = new CSLLNode();

		CSLLNode newNode = new CSLLNode();
		newNode.setValue(ValueInNode);
		newNode.setNextNode(newNode);

		headNode = newNode;
		tailNode = newNode;
		nodeSize = 1;
		return tailNode;
	}

	// 2. Traverse Operation
	public void traverseSLL() {

		if (headNode != null) {

			CSLLNode tempNode = headNode;

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

		CSLLNode nodeToInserted = new CSLLNode();
		nodeToInserted.setValue(Value);

		// Insert at First Location
		if (Location == 0) {
			nodeToInserted.setNextNode(headNode);
			headNode = nodeToInserted;
			// Only Difference
			tailNode.nextNode = headNode;

		} else if (Location > nodeSize) { // Insert at last
			nodeToInserted.setNextNode(headNode);
			tailNode.setNextNode(nodeToInserted);
			tailNode = nodeToInserted;
		} else {
			// Insert at any location except head and tail.
			CSLLNode tempNode = headNode;

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

		CSLLNode tempNode = headNode;

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
			CSLLNode tempNode = headNode.getNextNode();
			headNode = tempNode;
			nodeSize--;
			if (headNode == null) {
				tailNode = null;
			}
		} else if (deleteLocation > nodeSize) { // Deleting the tail node.
			System.out.println("Deleting Tail Node");
			CSLLNode tempNode = headNode;
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
			CSLLNode tempNode = headNode;
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
