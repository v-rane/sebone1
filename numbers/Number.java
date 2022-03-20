package com.sebone.java;

import java.util.Scanner;
/*class name - Number
 * Objective- to take the output from main class for finding factorial of the string
 * Author name - varsha rane 
 * date - 17-3-22
 */

public class Number { 
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);//taking input from keyboard
		System.out.println("enter a num:");
		int number1 = scan.nextInt();
		Number number = new Number() ;//object creation of Number class 
		int Fact_num =number.factorialOfNum(number1);
		System.out.println("Factorial of "+number1+" is: "+Fact_num);
	}
	/*class method - FactorialofNum
	 * Objective- to find the factorial of num whose logic is fact*=i
	 * Author name - varsha rane 
	 * date - 17-3-22
	 */
    public static int factorialOfNum(int number1) {
     int factorial = 1; 
	 for(int i=1;i<=number1;i++){    
	 factorial=factorial*i;    
    }   
	 return factorial; 
  }
}