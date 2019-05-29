package com.sarangjaiswal.JAVA_DESIGN_PATTERN.NULL_OBJECT_PATTERN;

// STEP 5: This is to demo the Null Pattern
public class NullPatternDemo {
	public static void main(String[] args) {
		
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
		
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
	}
}
