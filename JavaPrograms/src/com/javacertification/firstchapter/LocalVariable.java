package com.javacertification.firstchapter;

public class LocalVariable {
	public int notValid() {
		 int y = 10;
		 int x=30;// intialization is need for every local variable
		 int reply = x + y; 
		System.out.println(reply); return reply;
		 } 
	
	 
	public static void main(String[] args) {
		
		LocalVariable lc = new LocalVariable();
		lc.notValid();

	}

}
