/**
 * 
 */
package com.sebone.java.bestpractice.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Varsha Rane
 *
 */
public class CheckStringPresence {

	/**
	 * @param word2 
	 * @param scanner2 
	 * @className CheckStringPresence
	 * @objective How to find if a string is present in a text file?
	 * @autherName Varsha rane
	 * @date -26-4-2022
	 */
	
	public boolean getWordCount(Scanner scanner2, String word) {
		boolean flag = false;
		int count =0;
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(line);
			if(line.indexOf(word)!= -1) {
				flag = true;
				count = count++;			
			}
		}
		return flag;
	}
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Enter a string to be found");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		String filePath ="C:\\Users\\Varsha Rane\\Desktop\\myself.txt"; 
	    //Reading the contents of the file
		Scanner scanner2 = new Scanner(new FileInputStream(filePath));
		CheckStringPresence checkStringPresence = new CheckStringPresence();
		boolean flag =checkStringPresence.getWordCount(scanner2,word);
		if(flag) {
			System.out.println("the file has the given word ");
		}
		else {
			System.out.println("No, the file does not have word.");
		}
	}
}
