package com.sarangjaiswal.JUNIT4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Rule_Annotation {
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void test_division() {
		thrown.expect(ArithmeticException.class);
		thrown.expectMessage("/byZero");
		
		System.out.println("Before - Testing Div By Zero");
		int i =1/0;
		System.out.println("After - Testing Div By Zero");
		
		
	}

}
