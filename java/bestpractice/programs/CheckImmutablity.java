package com.sebone.java.bestpractice.programs;

import java.util.Scanner;

public class CheckImmutablity {
	public static boolean referenceCheck(String str1, String str2) {  
		boolean flag = false;
	       str1 += "gjh";  
	    if (str1 == str2) {  
	      flag = true;
	    } 
	    else {
	    	flag = false;
	    }
	    return flag;
	}  
    public static void main(String[] args) {  
    	Scanner scanner  = new Scanner(System.in);
    	System.out.println("Enter the first string");
    	String str1=scanner.nextLine();
    	System.out.println("Enter the second string");
    	String str2 = scanner.nextLine(); 
        boolean flag =referenceCheck(str1, str2);  
        if(flag) {
        	System.out.println("Both pointing to the same reference");   
    	} 
    	else {  
    		System.out.println("Both are pointing to different reference");  
    	}  
	  
    }
}
