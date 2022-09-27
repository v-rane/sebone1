package com.sebone.java.bestpractice.programs;

import java.util.Scanner;

public class ShowNPE {
	/*
	 * @objective -Write a code to show NullPointerException
	 */
   public static void getLengthOfStr(String str) {
        if (str.isEmpty()){
            System.out.println("Empty string");

        } 
        else {
            System.out.println(str.length());
        }
    }

    public static void main(String args[]) {
        String str = null;
        ShowNPE showNPE = new ShowNPE();
        showNPE.getLengthOfStr(str);
    }
}
