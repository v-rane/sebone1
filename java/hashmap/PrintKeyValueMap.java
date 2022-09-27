package com.sebone.java.hashmap;

import java.util.HashMap;
import java.util.Set;

public class PrintKeyValueMap {
	public static void main(String[] args) {
		
		HashMap<Integer,String> userDataMap = new HashMap<Integer,String>();
		userDataMap.put(1,"Varsha");
		userDataMap.put(2,"harsh");
		userDataMap.put(3, "taniya");
		userDataMap.put(4, "gipsy");
		userDataMap.put(5, "indra");
		userDataMap.put(8, "Bhupen");
		
		
		
//		String name1 = userDataMap.get(3);
//		System.out.println(name1);
//		
//		String name2 = userDataMap.get(5);
//		System.out.println(name2);
//		
		Set<Integer> keys = userDataMap.keySet();
		
		for(Integer k : keys) {
			String name =	userDataMap.get(k);
			System.out.println(name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
//		Set<Integer> key = userData.keySet();
//		for(Integer i :key) {
//			String Value = userData.get(i);
//			System.out.println("Key" + i + " "+ "Values=" + Value);
//		}
	}
}

