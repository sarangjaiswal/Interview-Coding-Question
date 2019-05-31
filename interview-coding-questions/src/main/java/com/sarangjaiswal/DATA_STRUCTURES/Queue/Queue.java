package com.sarangjaiswal.DATA_STRUCTURES.Queue;

public class Queue {
	Node head;
	
	
	// Add data into queue
	public void add(int data) {
		// if the queue is empty
		if (head == null) {
			head = new Node(data);
			return;
		}
		
		// if the queue is not empty
		Node newNode = new Node(data);
		Node current = head;
		while(current.next !=null) {	
			current = current.next;
		}
		current.next = newNode;
	}
	
	public int remove() {
		//if the queue is empty
		if(head == null) {
			return -99999;
		}
		
		// if the queue is not empty
		Node current = head;
		while(current.next == null) {
			current = current.next;
		}
		int data = current.next.data;
		current.next = null;
		return data;
	}
	
	public int getSize() {
		Node current = head;
		int count=0;
		if (current.next != null) {
			count = count + 1;
			current = current.next;
		}
		return count;
	}
}
