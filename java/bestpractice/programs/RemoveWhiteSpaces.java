/**
 * 
 */
package com.sebone.java.bestpractice.programs;

import java.util.Scanner;

/**
 * @author Varsha Rane
 * @date - 7-4-22
 * @objective - How to remove White spaces from String?
 * @className - RemoveWhiteSpaces
 */
public class RemoveWhiteSpaces {

	/**
	 * @method - noSpaces
	 * @return - String
	 * @param - char[] type 
	 * @objective - to print the string without spaces
    */
	public String noSpaces(char []nameArray) {
		String str= "";
		//to iterate array and remove if it has single(' ') or more than that spaces(\t) and
		for(int i =0;i<nameArray.length;i++) {
		   	if((nameArray[i]!= ' ')&& (nameArray[i]!='\t')) {
		   		 str= str + nameArray[i];
		   	}
		}
		//  String noSpaceStr = str.replaceAll("\\s", ""); // for replacing all spaces
		return str;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		//convert into array with charArray method for iterating each letter 
		char[] nameArray = name.toCharArray();
		RemoveWhiteSpaces removeWhiteSpaces = new RemoveWhiteSpaces();	
		String noSpaceName = removeWhiteSpaces.noSpaces(nameArray);
		System.out.println(noSpaceName);
	}
}
