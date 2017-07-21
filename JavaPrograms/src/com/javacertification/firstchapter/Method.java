package com.javacertification.firstchapter;

public class Method {
	public static void main(String[] args) {
	//	int value = null;  DOES NOT COMPILE.PRIMITIVE TYPES CANNOT BE ASSIGNED TO NULL
		String s = null;
		
		
		String reference = "hello";
		int len = reference.length();//REFERENCE TYPE CAN CALL METHOD
		// int bad = len.length();  DOES NOT COMPILE PRIMITIVE TYPE DO NOT HAVE METHODS
		
	}

}
