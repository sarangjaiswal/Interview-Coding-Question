package com.sarangjaiswal;

// Question:  Implement a stack using array.
// You need to implement Stack using array. You need to write push and pop methods to demonstrate Stack behavior(Last In First Out).
// https://java2blog.com/implement-stack-using-array-in-java/
public class ImplementStackUsingArray {
	
	int size;
	int arr[];
	int top;
	
	public ImplementStackUsingArray(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public boolean isFull() {
		return (size - 1 == top);
	}
	
	public boolean isEmpty() {
		return(top == -1);
	}
	
	public void push(int pushedElement) {
		if(!isFull()) {
			top++;
			arr[top] = pushedElement;
			System.out.println("Pushed Element:" + pushedElement);
		}else {
			System.out.println("Stack is full!");	
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped Element :"+ arr[returnedTop]);
			return arr[returnedTop];
		}else {
			System.out.println("Stack is Empty!");
			return -1;
		}
	}

	
	
	public static void main(String[] args) {
		ImplementStackUsingArray customStack = new ImplementStackUsingArray(10);
		
		System.out.println("IsEmpty : " + customStack.isEmpty());
		System.out.println("IsFull : " + customStack.isFull());
		System.out.println("=========================");
		customStack.push(10);
		customStack.push(20);
		customStack.push(30);
		customStack.push(40);
		System.out.println("=========================");
		System.out.println("IsEmpty : " + customStack.isEmpty());
		System.out.println("IsFull : " + customStack.isFull());
		System.out.println("=========================");
		customStack.pop();
		customStack.pop();
		customStack.pop();
		customStack.pop();
		System.out.println("=========================");
		System.out.println("IsEmpty : " + customStack.isEmpty());
		System.out.println("IsFull : " + customStack.isFull());		
	}

}
