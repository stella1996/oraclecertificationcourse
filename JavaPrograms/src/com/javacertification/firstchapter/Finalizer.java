package com.javacertification.firstchapter;

public class Finalizer {
	 protected void finalize() {
	 System.out.println("Calling finalize");
	 }
	 public static void main(String[] args) {
	 Finalizer f = new Finalizer();
	 f.finalize();
	 } }