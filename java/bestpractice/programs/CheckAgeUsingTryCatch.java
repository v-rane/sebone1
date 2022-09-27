package com.sebone.java.bestpractice.programs;

import java.util.Scanner;

public class CheckAgeUsingTryCatch {
  static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }
  
  public static void main(String[] args) {
	  System.out.println("Enter the age:");
	  Scanner scanner = new Scanner(System.in);
	  int age =scanner.nextInt();
	  CheckAgeUsingTryCatch checkAgeUsingTryCatch = new CheckAgeUsingTryCatch();
	  CheckAgeUsingTryCatch.checkAge(age); 
  }
	
}
