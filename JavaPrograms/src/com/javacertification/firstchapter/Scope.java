package com.javacertification.firstchapter;

public class Scope {
	
	public void life(){
		String name="stella";
		{
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		
		Scope sc = new Scope();
		sc.life();
		
	}

}
