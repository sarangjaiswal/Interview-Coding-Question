package com.sarangjaiswal.JAVA_DESIGN_PATTERN.NULL_OBJECT_PATTERN;

// STEP 3: Create a NullCustomer concrete class which extends the Abstract class.
public class NullCustomer extends AbstractCustomer{

	// Implementing the methods in abstract class
	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return "Not Avaliable in DB";
	}
}
