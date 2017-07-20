package com.javacertification.firstchapter;

import java.util.*; // imports java.util.Random among other things
public class ImportExample1 {
 public static void main(String[] args) {
 Random r = new Random();
 System.out.println(r.nextInt(10));
 }
}
/*In this example, we imported java.util.Random and a pile of other classes. The * is a
wildcard that matches all classes in the package. Every class in the java.util package is
available to this program when Java compiles it.*/