package com.javaprograms.simple;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4;
		long y = x * 4 - x++;
		if (y < 10) {
			System.out.println("Too Right");
		} else {
			System.out.println(y);
			System.out.println("Too Low");
		}

	}

}
