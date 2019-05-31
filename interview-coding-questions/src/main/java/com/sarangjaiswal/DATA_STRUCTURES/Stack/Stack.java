package com.sarangjaiswal.DATA_STRUCTURES.Stack;

public class Stack {
	Node head;
	
	// push an item into stack
	public void push(int data) {
		// if there is no items in the stack
		if (head == null) {
			head = new Node(data);
			return;
		}
		
		// if there are items in the stack
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
		return;
	}
	
	// pop an item from stack
	public int pop() {
		// if there is no data in stack 
		if (head == null) return -99999;
		
		//if there is data in stack
		int data = head.data;
		head = head.next;
		return data;
	}

}
