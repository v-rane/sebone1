package com.sebone.java.practice;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class VoterIdCheck {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> VoterId = new LinkedHashMap<Integer,String>();
		VoterId.put(101, "Varsha");
		VoterId.put(104, "Faran");
		VoterId.put(102, "Sakshi");
		VoterId.put(null, null);
		VoterId.put(102, "prachi");
		VoterId.put(109, "Saily");
		VoterId.put(105, "Harsh");
		VoterId.put(108, "Jack");
        
		Set<Entry<Integer, String>> keys = VoterId.entrySet();
	    for(Entry<Integer, String> key : keys) {
			//String person = VoterId.get(key);
			System.out.println(key);
		
		}
	   // Set<Integer> k = VoterId.();
	   // for()
	}

}