package com.sarangjaiswal.JAVA_DESIGN_PATTERN.FACTORY_PATTERN;

//STEP 7: Create a Concrete Class Circle which implements Shape Interface
public class Circle implements Shape{
	
	// STEP 8: Since the Circle implements Shape Interface it has to implement all the method defined in Shape Interface
	public void draw() {
		System.out.println("Inside Circle :: draw() method.");
	}
}
