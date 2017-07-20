package com.javaprograms.simple;

public class Add {
	int a = 5, b = 6;

	public static void main(String args[]) {

		Add tot = new Add();
		int Total = tot.add();
		System.out.println("The addition of two values is " + Total);
	}

	public int add() {
		return a + b;
	}
}
  