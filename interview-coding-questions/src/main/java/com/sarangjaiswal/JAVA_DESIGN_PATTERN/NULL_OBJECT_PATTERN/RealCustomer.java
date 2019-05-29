package com.sarangjaiswal.JAVA_DESIGN_PATTERN.NULL_OBJECT_PATTERN;

// STEP 2: Create a concrete class which extends abstract class
public class RealCustomer extends AbstractCustomer{

	// CONSTTUCTOR
	public RealCustomer(String name) {
		this.name = name;
	}
	
	// Implementing the methods in Abstract class
	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public String getName() {
		return name;
	}
}
