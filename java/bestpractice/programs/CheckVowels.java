	package com.sebone.java.bestpractice.programs;
	import java.util.Scanner;

	/**
	 *@author Varsha Rane
	 *@objective -Java Program to check if a vowel is present in the string?
	 *@date- 7-4-22
	 *@className - CheckVowels
	*/
	public class CheckVowels {

		/**
		 * @method - getVowels
		 * @return - boolean
		 * @param - string type 
		 * @objective - checking if string has vowels
	    */
		public boolean getVowels(String name) {
			//flag will return if true or not
			boolean flag= false;
			// for loop will check if vowels are present or not using || operator
			for(int i=0;i<name.length();i++){
				if(name.charAt(i)=='a'||name.charAt(i)=='e'|| name.charAt(i)=='i'|| name.charAt(i)=='o'||name.charAt(i)=='u') {
					
					flag= true;
				}
			}
			return flag;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("enter the name which is to be checked:");
			//taking input
			Scanner scanner = new Scanner(System.in);
			String name = scanner.nextLine();
			//class object created 
			CheckVowels checkVowels = new  CheckVowels();
			//name is converted into lowercase and passed in if 
			if(checkVowels.getVowels(name.toLowerCase())){
				System.out.println("Yes, the string contains vowels: "+ name);
			}
			else {
				System.out.println("No, the string name doesnot contains vowels: "+ name);
			}
		}
	
	}
