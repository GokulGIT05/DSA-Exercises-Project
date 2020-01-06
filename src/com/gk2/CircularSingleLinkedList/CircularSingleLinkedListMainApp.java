package com.gk2.CircularSingleLinkedList;

public class CircularSingleLinkedListMainApp {

	public static void main(String[] args) {

		CircularSingleLinkedList sll = new CircularSingleLinkedList();

		// 1. Creation
		CSLLNode mainLL = sll.createSingleLinkedList(10);
		System.out.println(mainLL);

		// 2. Traverse
		sll.traverseSLL();
		System.out.println("*******************");

		// 3. Insertion Operation.
		sll.insertNode(555, 0); // Insert at first Location
		sll.traverseSLL();

		sll.insertNode(25, 5); // Insert at Last
		sll.traverseSLL();
		System.out.println("*******************");
		// Insertion at Middle.
		sll.insertNode(99, 1);
		sll.traverseSLL();
		System.out.println("*******************");

		// 4. Search Operation based on value.
		sll.searchValueInLL(99);
		sll.searchValueInLL(200);
		System.out.println("*******************");

		// 5. deleting a Node at given location
		sll.deleteNodeAtGivenLocation(1);
		sll.traverseSLL();
		System.out.println("*******************");

		sll.deleteNodeAtGivenLocation(1);
		sll.traverseSLL();
		System.out.println("*******************");

		/*
		 * sll.deleteNodeAtGivenLocation(0); sll.traverseSLL();
		 * 
		 * sll.deleteNodeAtGivenLocation(2); sll.traverseSLL();
		 */

		// 6. deleting entire Linked List.

		sll.deleteLinkedList();
		sll.traverseSLL();
	}

}
