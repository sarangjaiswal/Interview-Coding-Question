package com.sarangjaiswal.DATA_STRUCTURES.LinkedList;

public class LinkedList {
	Node head;
	
	// Append data in linked list
	public void append(int data) {
		// If there is no element in Linked List
		if(head == null) {
			// Create a new Node
			head = new Node(data);
			return;
		}
		// If the Linked List has some data. Then create a pointer to head called current
		Node current = head;
		// Navigate through the linked list until you reach the end of the linked list
		while(current.next != null) {
			current = current.next;
		}
		// create a new node at the end of the linked list
		current.next = new Node(data);
	}
	
	// Prepend data into linked list
	public void prepend(int data) {
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	// Delete a node 
	public void deleteWithValue(int data) {
		
		// If there is no element in linked list then do nothing
		if (head == null) {
			return;
		}
		
		// If there is element in linked list, then create a pointer to head 
		Node current = head;
		
		// If you want to delete the first node or head 
		if(current.data == data) {
			head = head.next;
			return;
		}
		
		// If you want to delete the node in between
		while(current.next != null) {
			if(current.next.data == data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
		
	}
	
	// Find the Size of Linked List
	public int getSize() {
		// Return 0 if there is no element in linked list
		if (head == null) return -1;
		
		// Navigate through the linked list and return a value
		Node current = head;
		int count = 0;
		while(current.next != null) {
			count = count + 1;
			current = current.next;
		}
		return count;
	}
}
