package com.sebone.java.hashmap;

import java.util.HashMap;
import java.util.Set;

public class MapRollNumberName {

	 public static void main(String[] args) {
			MapRollNumberName mapRollNumberName = new MapRollNumberName();

			HashMap<Integer,String> map = new HashMap<Integer,String>();
			
		   map.put(10, "varsha");
		   map.put(20, "tanisha");
		   map.put(30, "faran");
		   map.put(40, "harsh");
		   map.put(50, "sakshi");

	 
		   
			
			//mapRollNumber3.setName("karan");
		   Set<Integer > keyList = map.keySet();
			
	 for(Integer i : keyList) {
		 String value = map.get(i);
		 System.out.println("key " + i + "  Value: "+value);
	 }
  }
}
