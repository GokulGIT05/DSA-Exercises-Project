package com.gk3.stackByArray;

public class StackMainApp {

	public static void main(String[] args) {
		
		// 1. Create a Stack
		StackByArrayImpl stackObj = new StackByArrayImpl(5);
		System.out.println(stackObj);
		
		//2. Push Operation.
		stackObj.pushStack(10);
		System.out.println(stackObj);
		stackObj.pushStack(20);
		System.out.println(stackObj);
		stackObj.pushStack(30);
		System.out.println(stackObj);
		
		// 3.Pop Operation
		stackObj.popStack();
		System.out.println(stackObj);
		
		// 4. Peek Operation
		stackObj.peekStack();
		stackObj.peekStack();
		
		// 5. Delete Array.
		stackObj.deleteArray();
		System.out.println(stackObj);
	}

}
