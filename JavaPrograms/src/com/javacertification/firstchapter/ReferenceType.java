package com.javacertification.firstchapter;

public class ReferenceType {
	
	public static void main(String[] args) {
		
		String Name= "stella";
		System.out.println(Name);
		System.out.println(Name.length());
		System.out.println(Name.indexOf("a"));
		System.out.println(Name.charAt(2));
		System.out.println(Name.trim());
		System.out.println(Name.substring(3, 5));
		System.out.println(Name.toLowerCase());
		System.out.println(Name.toUpperCase());
		System.out.println(Name.equalsIgnoreCase("STELLA"));
		System.out.println(Name.endsWith("a"));
		System.out.println(Name.equals("STELLA"));
		System.out.println(Name.startsWith("s"));
		System.out.println(Name.contains("s"));
		System.out.println(Name.contentEquals("lla"));
		System.out.println(Name.replace("s", "S"));
		
	}

}