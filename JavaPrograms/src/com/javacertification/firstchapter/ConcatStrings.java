package com.javacertification.firstchapter;

public class ConcatStrings {

	public String concat() {

		String firstName = "STELLA";
		String lastName = "STEFFY";

		String fullName = firstName + lastName;
		return fullName;
	}

	public static void main(String[] args) {
		ConcatStrings c = new ConcatStrings();

		System.out.println(c.concat());

	}

}
