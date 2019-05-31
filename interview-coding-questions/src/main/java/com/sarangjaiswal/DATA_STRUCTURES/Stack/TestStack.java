package com.sarangjaiswal.DATA_STRUCTURES.Stack;

public class TestStack {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.err.println(s.pop());
		s.push(50);
		s.push(60);
		System.err.println(s.pop());
	}
}
