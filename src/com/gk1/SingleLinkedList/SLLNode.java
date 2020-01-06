package com.gk1.SingleLinkedList;

public class SLLNode {

	int value;
	SLLNode nextNode;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public SLLNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(SLLNode nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "SLLNode [value=" + value + "]";
	}

}
