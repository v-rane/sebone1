package com.sebone.java;
import java.util.*;

/*Class name- SumofNum
 * Objective-this class will take the num for printing  the sum of numbers from 1 upto given no by taking input.
 * author name - varsha rane
 * Date- 17-3-22
 */
public class SumofNumber 
{		
   public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);//taking input from keyboard
	System.out.println("enter a num upto which Sum is to be print:");
	int number = scan.nextInt();
	SumofNumber sumofNumber = new SumofNumber() ;//object creation of SumofNum class 
	int SUM =sumofNumber.sumOfNumbers(number);
	System.out.println("sum of numbers upto no is: "+ SUM);
   }
   /*Method  name- SumOfNum
    * Objective-this class will print the sum of numbers from 1 upto given no with the logic adding next digit with the sum .
    * author name - varsha rane
    *  Date- 17-3-22 
    */
   public int sumOfNumbers(int number){
	   int sum=0;// this var will sum the numbers
	   for(int i=1;i<=number;i++) {
		   sum=sum+i; //logic for addition upto n
	   }
	   return sum;//System.out.println("sum of numbers upto no is:"+" "+ sum);
   }
}
