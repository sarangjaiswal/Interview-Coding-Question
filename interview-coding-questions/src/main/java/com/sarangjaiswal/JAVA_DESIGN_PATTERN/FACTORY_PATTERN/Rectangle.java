package com.sarangjaiswal.JAVA_DESIGN_PATTERN.FACTORY_PATTERN;

// STEP 3: Create a Concrete Class Rectangle which implements Shape Interface
public class Rectangle implements Shape{
	
	// STEP 4: Since the Rectangle implements Shape Interface it has to implement all the method defined in Shape Interface
	public void draw() {
		System.out.println("Inside Rectangle :: draw() method.");
	}
}
