package com.sarangjaiswal.JAVA_DESIGN_PATTERN.NULL_OBJECT_PATTERN;

// STEP 4: Create a factory which will create an if its present in names arrays else create a null object
public class CustomerFactory {
	public static final String[] names = {"Rob", "Joe", "Julie"};
	public static AbstractCustomer getCustomer(String name) {
		for (int i=0; i<names.length; i++ ) {
			if (names[i].equalsIgnoreCase(name)){
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}
}
