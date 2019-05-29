package com.sarangjaiswal.COLLECTIONS;

/*
 * https://www.geeksforgeeks.org/linked-list-in-java/
 * LinkedList in Java
 * Linked List are linear data structures where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. 
 * The elements are linked using pointers and addresses. Each element is known as a node. 
 * Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays. 
 * It also has few disadvantages like the nodes cannot be accessed directly instead we need to start from the head and follow through the link to reach to a node we wish to access.
 * To store the elements in a linked list we use a doubly linked list which provides a linear data structure and also used to inherit an abstract class and implement list and deque interfaces.
 * In Java, LinkedList class implements the list interface. 
 * The LinkedList class also consists of various constructors and methods like other java collections.
 */


// Question : Implement a stack using Linked List :
// You need to implement Stack using Linked List. You need to write push and pop methods to demonstrate Stack behavior(Last In First Out).
// https://java2blog.com/implement-stack-using-linked-list-in-java/
public class ImplementStackUsingLinkedList {
	private Node head;
	
	private class Node{
		int value;
		Node next;
	}
	
	public ImplementStackUsingLinkedList() {
		head = null;
	}
	
	public int pop() {
		if(head == null) {
			System.out.println("Stake is Empty!");
		}
		int value = head.value;
		head = head.next;
		return value;
	}
	
	public void push(int value) {
		Node oldHead = head;
		head = new Node();
		head.value = value;
		head.next = oldHead;
	}
	
	public static void printList(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ImplementStackUsingLinkedList lls = new ImplementStackUsingLinkedList();
		lls.push(10);
		lls.push(20);
		lls.push(30);
		lls.push(40);
		System.out.println("=============================");
		System.out.println(lls.pop());
		System.out.println(lls.pop());
		lls.push(50);
		lls.push(60);
		System.out.println("=============================");
		printList(lls.head);
	}

}
