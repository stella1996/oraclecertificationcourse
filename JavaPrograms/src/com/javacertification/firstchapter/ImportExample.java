package com.javacertification.firstchapter;
import java.util.Random;

public class ImportExample {
 public static void main(String[] args) {
 Random r = new Random(); // DOES NOT COMPILE
 System.out.println(r.nextInt(100));
 }
}

//The import statement tells the compiler which  package to look in to find a class. 