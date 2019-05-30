package com.sarangjaiswal.JAVA8;

import java.util.Optional;

// https://www.youtube.com/watch?v=IeTKqsMOhKs
public class OptionalExample {

	public static void main(String[] args) {
		
		// TRADITIONAL 
		String value = "Hello";
		
		if (value != null) {
			System.out.println(value.toUpperCase());
		} else {
			System.out.println("Hi");
		}
		
		
		// NEW IN JAVA8 USING OPTIONAL
		// Optional is a container which holds the object. When we call the .get method it returns the value of the container.
		// .ofNullable method will accept a null value
		// .of method will throw an exception when a null value is passed.
		Optional<String> new_value = Optional.ofNullable("HOLA");
		
		if(new_value.isPresent()) {
			System.out.println(new_value.get().toUpperCase());
		}
		
		
		
		// How to avoid boiler plate coding
		// .orElse method works similar to .get method. It returns the value of the container if the value is null then it returns the values mentioned in .orElse parameter.
		String val = null;
		Optional<String> another_value = Optional.ofNullable(val);
		System.out.println(another_value.orElse("Hey").toUpperCase());

	}

}
