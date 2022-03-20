package com.sebone.java;
import java.util.*;
 /*Class name- Prime
  * Objective-Prime class will print the given no.is prime or not after taking input from main class.
  *author name - varsha rane
  * Date- 17-3-22
  */
public class Prime {
    	public static void main(String args[]){
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.println("enter a number");
	    	int number = scanner.nextInt();
	    	Prime prime=new Prime();
	    	boolean getPrimeNum =prime.isPrimeNum(number);
	    	if(getPrimeNum){
	    		System.out.println("no is prime:"+ " "+number);
	    	}
	    	else {
	    		System.out.println("number is not prime"+ " "+number);   	   	
	   	    }
       }
	/*Method name - isPrime
	 * Objective- to print the num is prime or not with the logic that we will check num is divided by if its half it will be divided by num also 
	 * Author name - varsha rane 
	 * date - 17-3-22
	 */
	   public static boolean isPrimeNum(int number){
		   boolean isPrime =true;
		   if(number<2)
			 return false;
		   else 
			 for(int i= 2;i<=number/2;i++)
				 if(number%i==0)
					 isPrime= false;
				
		   return true;
	   } 
      
   }
    
    
