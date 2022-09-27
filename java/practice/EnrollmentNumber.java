package com.sebone.java.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class EnrollmentNumber {
	public static void main(String [] args) {
		HashMap<Integer,String> enroll = new HashMap<Integer,String>();
		enroll.put(101,"Amisha" );
		enroll.put(102, "Baban");
		enroll.put(103, "Varsha");
		enroll.put(104, "Sakshi");
		enroll.put(106, "Umesh");
		enroll.put(105, "Harsh");
		//System.out.println(enroll);
        //enroll.remove(2);
        //System.out.println(enroll);
		Set<Integer> keys = enroll.keySet();
		//iterating keys set
		for(Integer key : keys) {
			System.out.println("keys:" + key);
		}
		
//	for(Integer keys : key ) {
//			String value = enroll.get(keys);
//			System.out.println("Keys =" + keys + "Values = " + value );
//			
//		}
//		
//		enroll.clear();
//	   if(enroll.isEmpty()) {
//		   System.out.println("map is empty");
//	   }
//		
//	   else {
//		   System.out.println("not empty");
//	   }
	}
    
	
}
