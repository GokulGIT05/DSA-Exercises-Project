package com.gk4.stackByLinkedList;

public class LinkedListNode {

	private int value;

	private LinkedListNode nextNode;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public LinkedListNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(LinkedListNode nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "LinkedListNode [value=" + value + ", nextNode=" + nextNode + "]";
	}

}
