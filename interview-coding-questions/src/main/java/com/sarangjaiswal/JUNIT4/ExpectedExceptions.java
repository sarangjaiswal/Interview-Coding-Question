package com.sarangjaiswal.JUNIT4;

import java.util.ArrayList;

import org.junit.Test;

public class ExpectedExceptions {
	
	@Test(expected = ArithmeticException.class)
	public void test_division() {
		System.out.println("Before - Testing Div By Zero");
		int i=1/0;
		System.out.println("After - Testing Div By Zero");
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void test_empty_list() {
		System.out.println("Before - Testing Empty List");
		new ArrayList<String>().get(0);
		System.out.println("After - Testing Empty List");
	}

}
