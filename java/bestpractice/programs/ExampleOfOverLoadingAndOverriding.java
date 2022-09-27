/**
 * 
 */
package com.sebone.java.bestpractice.programs;

import java.util.Scanner;

/**
 * @author Varsha Rane
 *
 */
public class ExampleOfOverLoadingAndOverriding {

	/**
	 * @param args
	 */
	public static void main(String [] args){
		Dogy dog = new Hound();
		dog.bark();
		System.out.println("Enter a num upto which woof is displayed:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		dog.bark(num);
	}
	
	
}
//overriding 
	class Dogy extends ExampleOfOverLoadingAndOverriding {
	    public void bark(){
	        System.out.println("woof ");
	    }
	    //overloading bark method 
	    public void bark(int num) {
	    	for(int i=0;i<num;i++) {
	    		System.out.println("woof");
	    	}
	    }
	    
	}
	class Hound extends Dogy{
	    public void sniff(){
	        System.out.println("sniff ");
	    }
	 
	    public void bark(){
	        System.out.println("bowl");
	    }
	}
	 
	


