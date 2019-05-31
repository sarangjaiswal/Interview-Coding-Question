package com.sarangjaiswal.DATA_STRUCTURES.DoubleLinkedList;

public class DoubleLinkedList {
	Node head;
	
	// Append data to Double linked list
	public void append(int data) {
		// if there is no data in double linked list
		if(head == null) {
			head = new Node(data);
			return;
		}
		
		// if double linked list has values. Then create a pointer to head called current
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		// create a node at the end of the double linked list
		current.next = new Node(data);
		// assign the new nodes previous to the head node.
		current.next.prev = current;	
	}
	
	// prepend data into double linked list
	public void prepend(int data) {
		Node newHead = new Node(data);
		newHead.next = head;
		head.prev = newHead;
		head = newHead;
	}
	
	// Delete a node
	public void deleteWithValue(int data) {
		
		// if double linked list has no elements
		if(head == null) {
			return;
		}
		
		// if there is element in linked list, the create a pointer to head.
		Node current = head;
		
		// if you want to delete the first node
		while(current.data == data) {
			head = head.next;
			head.prev = null;
			return;
		}
		
		// if you want to delete the node in between
		while(current.next != null) {
			if (current.next.data == data) {
				current.next.next.prev = current.next;
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	
	public int getSize() {
		// if there is no elements then return -1
		if(head == null) return -1;
		
		// if there are elements then return a value
		Node current = head;
		int count = 0;
		while(current.next != null) {
			count = count + 1;
			current = current.next;
		}
		return count;
	}
}
