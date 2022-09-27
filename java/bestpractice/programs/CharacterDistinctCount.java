/**
 * 
 */
package com.sebone.java.bestpractice.programs;

import java.util.Scanner;

/**
 * @author Varsha Rane
 *
 */
public class CharacterDistinctCount {

	/**
	 * @className -CharacterDistinctCount
	 * @objective - How to get distinct characters and their count in a String?
	 */
	public char getCharDistinctCount(String name) {
		char stringIndex = 0 ;
		for (int i = 0; i < name.length(); i++)
	    {
	        int flag = 0;
	        for (int j = 0; j < name.length(); j++)
	        {
	            // checking if two characters are equal
	            if (name.charAt(i) == name.charAt(j) && i != j)
	            {
	                flag = 1;
	                break;
	            }
	        }
	        if (flag == 0)
	           // System.out.print(name.charAt(i));
	       stringIndex = name.charAt(i);
	    }
		return stringIndex;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the name:");
		String name =scanner.nextLine();
		CharacterDistinctCount characterDistinctCount = new CharacterDistinctCount();
		char stringIndex =characterDistinctCount.getCharDistinctCount(name);
		
		System.out.println("Yes, distinct count characters."+ stringIndex);
		

		

	}

}
