package com.sarangjaiswal.DATA_STRUCTURES.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.append(5);
		l.append(4);
		l.append(3);
		System.out.println(l.getSize());
		l.deleteWithValue(3);
		System.out.println(l.getSize());

	}

}
