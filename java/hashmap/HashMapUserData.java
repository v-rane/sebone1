package com.sebone.java.hashmap;

import java.util.HashMap;
import java.util.Set;

public class HashMapUserData {
 public static void main(String[] args) {
	 UserData userData1= new UserData();
	 userData1.setAge(22);
	 userData1.setName("Varsha");
	 userData1.setRollNumber(1);
	 
	 UserData userData2= new UserData();
	 userData2.setAge(21);
	 userData2.setName("nayan");
	 userData2.setRollNumber(3);
	 
	 UserData userData3 = new UserData();
	 userData3.setAge(24);
	 userData3.setRollNumber(4);
	 userData3.setName("ganesh");

	 UserData userData4 = new UserData();
	 userData4.setAge(25);
	 userData4.setRollNumber(6);
	 userData4.setName("yash");
	 
	 UserData userData5 = new UserData();
	 userData5.setAge(21);
	 userData5.setName("janvi");
	 userData5.setRollNumber(7);
	 
	 
	 HashMap <Integer,UserData> data1= new HashMap<Integer,UserData>();
	 data1.put(userData1.getRollNumber(), userData1);
	 data1.put(userData2.getRollNumber(), userData2);
	 data1.put(userData3.getRollNumber(), userData3);
	 data1.put(userData4.getRollNumber(), userData4);
	 data1.put(userData5.getRollNumber(), userData5);
	 
	 
	 Set<Integer> keys = data1.keySet();
	 for(Integer key:keys) {
		 UserData value=data1.get(key);
		 System.out.println("User Roll Number:"+ key+" User Name"+ value.getName()+" User Age:"+ value.getAge());
	 }
	 
 }
}
