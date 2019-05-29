package com.sarangjaiswal.COLLECTIONS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// Question :  Implement a stack using two queues .
// You need to use two queues to implement stack behavior.You need to write push and pop methods to demonstrate Stack behavior(Last In First Out).

public class ImplementStackUsingTwoQueues {
	Queue<Integer> queue1;
	Queue<Integer> queue2;
	
	public ImplementStackUsingTwoQueues(){
		queue1 = new LinkedList<Integer>();
		queue2 = new LinkedList<Integer>();		
	}
	
	public void push(int i) {
		if (queue1.size()==0) {
			queue1.add(i);
		} else {
			
			int sizeOfQueue1 = queue1.size();
			
			for(int j=0 ; j<sizeOfQueue1 ; j++) {
				queue2.add(queue1.remove());
			}
			
			queue1.add(i);
			
			for(int k=0;k<sizeOfQueue1;k++) {
				queue1.add(queue2.remove());
			}
			
		}
	}
	
	public int pop() {
		if(queue1.size()==0) {
			System.out.println("Nothing to pop");
		}
		return queue1.remove();
	}
	
	public void print() {
		Iterator it = queue1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void main(String[] args) {
		
		ImplementStackUsingTwoQueues stack = new ImplementStackUsingTwoQueues();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.pop();
		stack.push(80);
		stack.pop();
		stack.print();
	}

}
