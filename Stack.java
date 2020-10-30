package com.TheMasterMindGroup.ObjectsAndClasses;

public class Stack {
	int stck[] = new int[10];
	int tos;
	
	//Initialising top of the stack
	Stack() {
		tos = -1;
	}
	
	//Push of an item onto the stack
	void push (int item) {
		if (tos ==9)
			System.out.println("Stack is full.");
		else
			stck[++tos ] = item;
	}
	
	//Pop of the item from the Stack
	int pop() {
		if(tos<0) {
			System.out.println("Stack Underflow.");
			return 0;
		}else
			return stck[tos--];
	}
	
}

class TestStack{
	public static void main(String[] args) {
		Stack myStack1 = new Stack();
		Stack myStack2 = new Stack();
		
		//push some of the numbers onto the stack
		for(int i=0;i<10;i++) {
			myStack1.push(i);
		}
		for(int i=0;i<20;i++) {
			myStack2.push(i);
		}
		
		//pop these numbers from the stack
		System.out.println("Stack in myStack1: ");
		for(int i=0;i<10;i++) {
			System.out.println(myStack1.pop());
		}

		System.out.println("Stack in myStack2: ");
		for(int i=0;i<10;i++) {
			System.out.println(myStack2.pop());
		}
	}
}
