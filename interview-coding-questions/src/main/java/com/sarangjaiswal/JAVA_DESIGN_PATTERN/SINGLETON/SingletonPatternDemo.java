package com.sarangjaiswal.JAVA_DESIGN_PATTERN.SINGLETON;

// STEP 6: Create a demo class
public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		// STEP 7: Get the only object available of SingleObject Class
		// NOTE: You wont be able to do something like "SingleObject obj = new SingleObject();" because the constructor is private
		SingleObject obj = SingleObject.getInstance();
		
		// STEP 8: Execute the method
		obj.showMessage();
	}

}
