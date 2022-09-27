/**
 * 
 */
package com.sebone.java.bestpractice.programs;

import java.util.Scanner;

/**
 * @author Varsha Rane
 * @date - 8-4-22
 * @objective - How to remove leading and trailing white spaces from a string?
 * @className - RemoveLeadTrailSpaces
 */
public class RemoveLeadTrailSpaces {

	/**
	 * @method - trimName
	 * @objective - to remove spaces from trail and lead
	 * @param String 
	 * @return String
	 */
//logic 1
	
	public String trimName(String name) {
		int leftWhiteSpace = 0, rightWhiteSpace = name.length()-1;
		 char left= name.charAt(0);
		 char right = name.charAt(name.length() -1);
		String result = "";
		
		if((name.length()== 0)||(name == null)) {
			result= "";
		}
		else{
			while(((left == ' ')||(right == ' ')) && (leftWhiteSpace <name.length()- 1 - rightWhiteSpace )) {
				if(left == ' ') {
					 ++leftWhiteSpace;
					 left = name.charAt(leftWhiteSpace);
				}	
				if(right ==' ') {
					--rightWhiteSpace;
					if(rightWhiteSpace>=0) {
					right = name.charAt(rightWhiteSpace);
					}
				}
			}
			result = name.substring(leftWhiteSpace,name.length() -1 -rightWhiteSpace);
		}
		return result;	
	}
	
//   logic 2	
//	public String trimName(String name) {
//		String trimName = name.trim();
//		return trimName;
//	}

	public static void main(String[] args) {
		System.out.println("enter the name :");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		RemoveLeadTrailSpaces removeLeadTrailSpaces = new RemoveLeadTrailSpaces();
		String noSpaceName = removeLeadTrailSpaces.trimName(name);
		System.out.println("the name without lead trail spaces is: "+ noSpaceName );
	}

}
