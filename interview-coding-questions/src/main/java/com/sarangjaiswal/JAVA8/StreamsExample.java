package com.sarangjaiswal.JAVA8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamsExample {

	public static void main(String[] args) {
		String[] bucket = {"sarang", "tannavi", "anaya", "tiasha"};
		Arrays.asList(bucket).forEach((x) -> System.out.println(x));
		
		System.out.println(IntStream.range(1, 10).sum());
	}
}
