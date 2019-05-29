package com.sarangjaiswal.JAVA_DESIGN_PATTERN.FACTORY_PATTERN;

// STEP 5: Create a Concrete Class Square which implements Shape Interface
public class Square implements Shape{

	// STEP 6: Since the Square implements Shape Interface it has to implement all the method defined in Shape Interface
	public void draw() {
		System.out.println("Inside Square :: draw() method.");	
	}	
}
