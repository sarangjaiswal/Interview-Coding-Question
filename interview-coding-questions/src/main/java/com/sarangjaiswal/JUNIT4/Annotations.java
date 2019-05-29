package com.sarangjaiswal.JUNIT4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;



// this example helps us understand the annotation sequence
// Output
/*
	In Before Class
	In Annotations Constructor
	In Before
	In Test
	In After
	In After Class
*/

public class Annotations {
	
	// constructor
	public Annotations() {
		System.out.println("In Annotations Constructor");
	}
	
	@Ignore
	@Test
	public void test_ignore() {
		System.out.println("In Ignore");
	}
	
	@AfterClass
	public static void test_after_class() {
		System.out.println("In After Class");
	}
	
	@BeforeClass
	public static void test_before_class() {
		System.out.println("In Before Class");
	}
	
	@After
	public void test_after() {
		System.out.println("In After");
	}
	
	@Before
	public void test_before() {
		System.out.println("In Before");
	}
	
	@Test
	public void test_one() {
		System.out.println("In Test");
	}

}
