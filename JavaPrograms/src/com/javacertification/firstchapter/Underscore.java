package com.javacertification.firstchapter;

public class Underscore {
	public static void main(String[] args) {
		int million1 = 1000000;
		int million2 = 1_000_000;
		
		
		//double notAtStart = _1000.00; // DOES NOT COMPILE
		//double notAtEnd = 1000.00_; // DOES NOT COMPILE
		//double notByDecimal = 1000_.00; // DOES NOT COMPILE
		double annoyingButLegal = 1_00_0.0_0;
		
		
		
		//Underscore cannot be placed at the beginning,end and right before the decimal point and right after the decimal point.
	}

}
