package com.javacertification.firstchapter;

public class ChickSample {
	private String name = "Fluffy";
	{
		System.out.println("setting field");
		System.out.println("fluffy"+name);

	}

	public ChickSample() {
		name = "Tiny";
		System.out.println("setting constructor");
	}

	public static void main(String[] args) {
		ChickSample chick = new ChickSample();
		System.out.println(chick.name);
	}
}