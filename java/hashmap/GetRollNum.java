package com.sebone.java.hashmap;

import java.util.HashMap;
import java.util.Set;

public class GetRollNum {
public static void main(String []args) {
	GetRollNum getRollNum = new GetRollNum();
	HashMap<Integer,String> map= new HashMap<Integer,String>();
	map.put(1,"varsha");
	map.put(2, "baban");
	map.put(3, "faran");
	
	Set<Integer>key = map.keySet();
	for(Integer i :key) {
		String values = map.get(i);
		System.out.println("key=" +i+" " + "values=" + values);
		
	}
}
}
