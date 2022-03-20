package com.sebone.java;

//com.<orgname>.<groupname>
//com.sebone.java

import java.util.Scanner;
/*class name - Count_digits
 * Objective- taking input from main class for counting num of digits in a number as input
 * Author name - varsha rane 
 * date - 17-3-22
 */
//CountDigit
public class CountDigit {  
	 public static void main(String args[]) {
		 Scanner scanner = new Scanner(System.in);//taking input from keyboard
		 System.out.println("enter a num:");
		 int number = scanner.nextInt();
		 CountDigit countDigit = new CountDigit() ;//object creation of count digits class 
		 int count= countDigit.countDigits(number);
		 System.out.println("num of digits in num is:" +" "+ count);
		 scanner.close();
	 }
	  /*method name - countDigits
	   * Objective- to count the digits of num
	   * Author name - varsha rane 
	   * date - 17-3-22
	   */
	  public static int countDigits(int number){
		  int count=0;//tocount 
		  while(number>0) {
			  number =number/10;
			  count++;
		  }
		  return count;
	 }
}
