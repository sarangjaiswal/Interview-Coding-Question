package com.sarangjaiswal;

import java.util.Hashtable;

// Source: https://www.youtube.com/watch?v=GJdiM-muYqc
// Title: Get the first recurring char from a string.
public class First_Recurring_Character {
	
	public static Character get_first_recurring_character(String str) {
		Hashtable<Character, Integer> htable = new Hashtable<Character, Integer>();
		
		for (int i=0; i<str.length(); i++) {
			if(htable.containsKey(str.charAt(i))) {
				return str.charAt(i);
			} else {
				htable.put(str.charAt(i), 1);
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		String given_str = "ABCDBA";
		System.out.println(get_first_recurring_character(given_str));
	}
}
