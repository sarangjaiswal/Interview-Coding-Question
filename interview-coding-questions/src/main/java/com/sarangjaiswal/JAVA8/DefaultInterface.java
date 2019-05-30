package com.sarangjaiswal.JAVA8;

public interface DefaultInterface {
	
	void startDevice();
	
	// Below method is added after this interface was implemented.
	default void stopDevice() {
		System.out.println("Inside DefaultInterface :: stopDevice() method.");
	}
}
