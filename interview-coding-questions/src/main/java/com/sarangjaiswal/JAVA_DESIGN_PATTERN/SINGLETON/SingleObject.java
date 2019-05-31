package com.sarangjaiswal.JAVA_DESIGN_PATTERN.SINGLETON;

// STEP 1: Create a SingleObject Class
public class SingleObject {
	
	// STEP 2: Create an object of SingleObject which is private
	private static SingleObject instance = new SingleObject();
	
	// STEP 3: Make the constructor of the class as Private, so that other classes cannot create an object
	private SingleObject() {}
	
	// STEP 4: Create a static method which get the only instance 
	public static SingleObject getInstance() {
		return instance;
	}
	
	// STEP 5: Example method present in the class
	public void showMessage() {
		System.out.println("Hello");
	}
}
