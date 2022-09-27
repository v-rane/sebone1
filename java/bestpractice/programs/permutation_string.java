package com.sebone.java.bestpractice.programs;
import java.util.*;
public class permutation_string {
	
	static void printPermutation(String str,String ans)
	{
		if(str.length()==0) {
			System.out.print(ans+" ");
			return;
			
		}
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			String ros= str.substring(0,i)+ str.substring(i+1);
			printPermutation(ros,ans +ch);
	
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.nextLine();
		printPermutation(s,"");
	}
	

}
