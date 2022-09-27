/**
 * 
 */
package com.sebone.java.bestpractice.programs;

import java.util.Arrays;
import java.util.Scanner;

public class SameElementArray {
	/**
	 * @author Varsha Rane
	 * @className SameElementArray
	 * @objective To check if two arrays contains same elements.
	 * @date 26-4-22
	 */
	
 public static boolean checkSameElements(int[] array1, int[] array2) {
	 /**
	  * @methodName checkSameElements
	  * @objective to check if the array contains same elements or not
	  * @para -int[],int[]
	  * @return boolean
	  */
	 
	 Arrays.sort(array1);
	 Arrays.sort(array2);
	 int size1 = array1.length;
	 int size2 = array2.length;
	 boolean flag = true;
	 if(size1 != size2) {
		 flag = false;
	 }
	 else {
		for(int i=0;i<size1;i++) {
			if(array1[i] != array2[i]) 		
				flag = false;		
		}
	 }	 
	 return flag;
 }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of first array ");
		int n1 = scanner.nextInt(); 
		System.out.println("enter the elements of array1");
		int array1[] = new int[n1];
		for(int i =0;i<n1;i++) {
			array1[i]= scanner.nextInt();		
		}
		
		System.out.println("Enter the Size of second array ");
		int n2 = scanner.nextInt();
		int array2[]= new int[n2];
		System.out.println("enter the elements of array2");
		for(int i =0;i<n1;i++) {
			array2[i]= scanner.nextInt();		
		}
		
		SameElementArray sameElementArray = new SameElementArray();
		boolean areEqual =SameElementArray.checkSameElements(array1, array2);
		if(areEqual) {
			System.out.println("yes, both the arrays are equal");
		}
		else {
			System.out.println("No, both the arrays are not equal");
		}
		scanner.close();
	}

}
