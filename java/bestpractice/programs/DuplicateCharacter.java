/**
 * 
 */
package com.sebone.java.bestpractice.programs;

import java.util.Scanner;

/**
 * @author Varsha Rane
 *
 */
public class DuplicateCharacter {

	/**
	 * @param args
	 */
	public void getDuplicateCharacter(String name) {
		 int count;    
	        //Converts given string into character array  
	     char string[] = name.toCharArray();     
	     System.out.println("Duplicate characters in a given string: ");  
	     //Counts each character present in the string  
	     for(int i = 0; i <string.length; i++) {  
	       count = 1;  
	       for(int j = i+1; j <string.length; j++) {  
	           if(string[i] == string[j] && string[i] != ' ') {  
	               count++;  
	               //Set string[j] to 0 to avoid printing visited character  
	               string[j] = '0';  
	           }  
	       }  
	       //A character is considered as duplicate if count is greater than 1  
	       if(count > 1 && string[i] != '0')  
	         System.out.println(string[i]); 
	     }  
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the name:");
		String name =scanner.nextLine();
		
		DuplicateCharacter duplicateCharacter = new DuplicateCharacter();
		duplicateCharacter.getDuplicateCharacter(name);      
	}  
}
