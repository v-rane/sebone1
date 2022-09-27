/**
 * 
 */
package com.sebone.java.practice;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Varsha Rane
 *
 */
public class Vegetables {
	public static void main(String[] args) {
	ArrayList<String> vegList = new ArrayList<String>();
    vegList.add("yam");
    vegList.add("tomato");
    vegList.add("beetroot");
    vegList.add("capcicum");
    vegList.add("lady fingers");
    //for (Integer list : vegList) {
    	System.out.println(vegList);
    
    vegList.hashCode();
	System.out.println(vegList);

    vegList.remove(2);
	System.out.println(vegList);
	
	//vegList.get(0);
	System.out.println(vegList.get(0));

	
	System.out.println(vegList.get(2));

	
	System.out.println(vegList.get(3));

   //	vegList.set(0, "jam");
	System.out.println(vegList.set(0, "jam"));
   
	System.out.println(vegList.size());
    Collections.sort(vegList);
    System.out.println(vegList);
    vegList.clear();
	System.out.println(vegList); 
	
	

	}		

}
