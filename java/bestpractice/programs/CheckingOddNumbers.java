/**
 * 
 */
package com.sebone.java.bestpractice.programs;

import java.util.ArrayList;

/**
 * @author Varsha Rane
 * @date 7-4-22
 * @objective - Check if a List of integers contains only odd numbers?
 * @className - CheckingOddNumbers
 */
public class CheckingOddNumbers {
	/**
	 * @method - checkOddNumberList
	 * @return - boolean
	 * @param -  ArrayList<Integer>
	 * @objective - checking the odd numbers in list
    */

	public boolean checkOddNumberList(ArrayList<Integer> list) {
		boolean flag = true;
		for(int i=0;i<list.size();i++) {
			//if(list.get(i) != 0) {
				if(list.get(i)%2==0) {
					flag = false;
				}
			//}
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(9);
		list.add(17);
		list.add(3);
		list.add(5);
		list.add(9);
		CheckingOddNumbers checkingOddNumbers = new CheckingOddNumbers();
		if(checkingOddNumbers.checkOddNumberList(list)) {
			System.out.println("yes, the list has only odd numbers");
		}
		else {
			System.out.println("No, the list does not have odd numbers");
		}
		
		
	}

}
