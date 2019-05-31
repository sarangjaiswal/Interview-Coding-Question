package com.sarangjaiswal.DATA_STRUCTURES.DoubleLinkedList;

public class TestDoubleLinkedList {

	public static void main(String[] args) {
		DoubleLinkedList d = new DoubleLinkedList();
		d.append(1);
		d.append(2);
		d.append(3);
		System.out.println(d.getSize());
		d.prepend(4);
		System.out.println(d.getSize());
		d.deleteWithValue(2);
		System.out.println(d.getSize());
	}

}
