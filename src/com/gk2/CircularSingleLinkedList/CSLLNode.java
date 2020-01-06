package com.gk2.CircularSingleLinkedList;

public class CSLLNode {

	int value;
	CSLLNode nextNode;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public CSLLNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(CSLLNode nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "SLLNode [value=" + value + "]";
	}

}
