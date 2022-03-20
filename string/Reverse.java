package com.sebone.java;

import java.util.Scanner;
  /*class name - Reverse
   * Objective- to take the output from main class for reversing the string
   * Author name - varsha rane 
   * date - 17-3-22
   */
public class Reverse {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter a string to be  reversed:");
		String string = scanner.nextLine();
		Reverse reverse=new Reverse();
		String reverse_string = reverse.reverseString(string);
		System.out.println(reverse_string);
		scanner.close();
	}
	/*Method name - Reverse_String
	 * Objective- to display reverse of the string with the logic that converting string into first char array then displaying it in reverse order
	 * Author name - varsha rane 
	 * date - 17-3-22
	 */
  	public String reverseString(String string) {
  		String reverse="";
  		if(string.isEmpty())// to check string is empty
  			return string;
  		else {
  			char ch[] = string.toCharArray();//to convert in string array
  			for(int i=ch.length-1;i>=0;i--) {// loop iterate from reverse of array with ch.length
  				reverse = reverse+ch[i];
  			}
  		}
  		return reverse;
  	}
}
