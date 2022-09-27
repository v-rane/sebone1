/**
 * 
 */
package com.sebone.java.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import com.sebone.java.practicebyuserdata.UserData1;

/**
 * @author Varsha Rane
 *
 */
public class ArraylistOfuUserData {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		UserData1 userData1 = new UserData1();
		userData1.setAge(22);
		userData1.setName("Varsha");
		userData1.setRollNumber(101);
		
		UserData1 userData2 = new UserData1();
		userData2.setAge(19);
		userData2.setName("Varsha");
		userData2.setRollNumber(102);
		
		UserData1 userData3 = new UserData1();
		userData3.setAge(34);
		userData3.setName("harsha");
		userData3.setRollNumber(103);
		
		UserData1 userData4 = new UserData1();
		userData4.setAge(123);
		userData4.setName("kumud");
		userData4.setRollNumber(104);
		
		UserData1 userData5 = new UserData1();
		userData5.setAge(12);
		userData5.setName("Varsha");
		userData5.setRollNumber(105);
		
		UserData1 userData6 = new UserData1();
		userData6.setAge(12);
		userData6.setName("Sohail");
		userData6.setRollNumber(106);
		
		UserData1 userData7 = new UserData1();
		userData7.setAge(11);
		userData7.setName("kumud");
		userData7.setRollNumber(107);
		
	 // arraylist managing same type of names of userdata
      ArrayList<UserData1> list =new ArrayList<UserData1>();
      list.add(userData1);
      list.add(userData2);
      list.add(userData5);
      
      ArrayList<UserData1> list2 = new ArrayList<UserData1>();
      list.add(userData3);
      
      ArrayList<UserData1> list3 = new ArrayList<UserData1>();
      list.add(userData7);
      list.add(userData4);
      
      ArrayList<UserData1> list4 = new ArrayList<UserData1>();
      list.add(userData6);
      
      //to see if unique key as name all are displayed or not and checking size of hashmap
      HashMap<String,UserData1> hashmap = new HashMap<String,UserData1>();
      hashmap.put(userData1.getName(), userData1) ;
      hashmap.put(userData2.getName(), userData2);
      hashmap.put(userData3.getName(), userData3);
      hashmap.put(userData4.getName(), userData4);
      hashmap.put(userData5.getName(), userData5);
      hashmap.put(userData6.getName(), userData6);
      hashmap.put(userData7.getName(), userData7);
      
      
     //  size of hashmap is displayed by using hashmap.size();
      System.out.println(hashmap.size());
      //storing keyset as values 
      Set<String> nameList = hashmap.keySet();
      for(String key : nameList) {
    	  UserData1 user = hashmap.get(key);
    	  System.out.println("keys : "+ key + " rollNumber :"+ userData1.getRollNumber()+"age :" + userData1.getAge());
    	   
      }
     
      //using arraylist can display unique key of same name 
      
      HashMap<String,ArrayList<UserData1>> maplist = new HashMap<String,ArrayList<UserData1>>();
      maplist.put(userData1.getName(), list);
      maplist.put(userData3.getName(), list2);
      maplist.put(userData4.getName(), list3);
      maplist.put(userData6.getName(), list4);
      System.out.println(list.size());
      Set<String> map = maplist.keySet();
      for(String m : map) {
    	ArrayList<UserData1> data =  maplist.get(m);
    	for(UserData1 ud : data) {
    		System.out.println( " unique key: " + ud.getName()+ "age: "+ ud.getAge() + "rollnumber :"+ ud.getRollNumber());
    	}
    	  
      }
      

	  }
	  

}
