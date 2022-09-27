/**
 * if the key value is same example varsha 
 */
package com.sebone.java.practicebyuserdata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

//import com.sebone.java.sort.UserData;

/**
 * @author Varsha Rane
 *
 */
public class DisplayUserDataByHashMap {
	//main class 
	public static void main(String[] args) {
		//creating object of UserData1 class and storing values by passing values in set method
		UserData1 userData1 = new UserData1();
		userData1.setAge(22);
		userData1.setName("Sakshi");
		userData1.setRollNumber(101);
		
		UserData1 userData2 = new UserData1();
		userData2.setAge(21);
		userData2.setName("ganesh");
		userData2.setRollNumber(102);
		
		UserData1 userData3 = new UserData1();
		userData3.setName("Varsha");
		userData3.setAge(81);
		userData3.setRollNumber(103);
		
		UserData1 userData4 = new UserData1();
		userData4.setAge(23);
		userData4.setName("Faran");
		userData4.setRollNumber(104);
		
		UserData1 userData5 = new UserData1();
		userData5.setAge(22);
		userData5.setName("Varsha");
		userData5.setRollNumber(105);
		
		//creating hashmap and storing values in object in form of key value where the key is rollnumber
		HashMap<Integer,UserData1> dataMap = new HashMap<Integer,UserData1>();
		dataMap.put(userData1.getRollNumber(),userData1 );
		dataMap.put(userData2.getRollNumber(), userData2);
		dataMap.put(userData3.getRollNumber(), userData3);
		dataMap.put(userData4.getRollNumber(), userData4);
		dataMap.put(userData5.getRollNumber(), userData5);
		
		Set<Integer> keys = dataMap.keySet();
		// to display size of map that size is different as the unique values are inserted 
		int size1= dataMap.size();
		System.out.println("First map size "+size1);
		for(Integer key : keys) {
			
			UserData1 u1 = dataMap.get(key);
			//UserData1  = userData1.
		  	System.out.println("keys=" + key + "name" + u1.getName() + "age" + u1.getAge());	
		}
	
	
	   //creating hashmap and storing values of userdata list in key value pair where unique key is name
	   HashMap<String,UserData1> dataMap1 = new HashMap<String,UserData1>();
	   dataMap1.put(userData1.getName(),userData1);
	   dataMap1.put(userData2.getName(),userData2);
	   dataMap1.put(userData3.getName(), userData3);
	   dataMap1.put(userData4.getName(), userData4);
	   dataMap1.put(userData5.getName(), userData5);
	   int size2= dataMap1.size();
		System.out.println("Second  map size "+size2);
		
		// taking key values as name but same data is not inserted the time it is inserted so we manage arraylist for same type of data
	   Set<String> keyNames = dataMap1.keySet();
	   for(String key : keyNames) {
		   UserData1 user = dataMap1.get(key);
		   System.out.println("keys= " + key + "age :" + user.getAge() + "roll number=" + user.getRollNumber());
		   
	   }
	   //1 arraylist managed for same name of data and for different objects managed different arraylist
	   ArrayList<UserData1> list1 = new ArrayList<UserData1>();
	   list1.add(userData3);
	   list1.add(userData5);
	   
	   ArrayList<UserData1> list2 = new ArrayList<UserData1>();
	   list2.add(userData1);
	   
	   
	   ArrayList<UserData1> list3 = new ArrayList<UserData1>();
	   list3.add(userData2);
	   
	   ArrayList<UserData1> list4 = new ArrayList<UserData1>();
	   list4.add(userData4);
	   
	   // HashMap<String, ArrayList<UserData1>> in this statement string is taken as the key value is taken name and the other part is for arraylist 

	   HashMap<String, ArrayList<UserData1>> mapList = new HashMap<String, ArrayList<UserData1>>();
	   mapList.put(userData1.getName(), list2);
	   
	   mapList.put(userData2.getName(), list3);
		  
	   mapList.put(userData3.getName(), list1);
		
	   mapList.put(userData4.getName(), list4);
	   
	 //to display varsha as unique key name  
//	  ArrayList<UserData1> varshaList = mapList.get("Varsha");
//	  Set<String> key10 = mapList.keySet() ;
//	   for(String u :key10){
//		   ArrayList<UserData1> list11 = mapList.get(u);
//
//	   }
	   
//	   
   Set<String> key11 = mapList.keySet();
	   for(String k1 : key11) {
		   ArrayList<UserData1> list11 = mapList.get(k1);		   
		  // System.out.println(k1.getAge()+ k1.getName()+ k1.mapList());
	   
	   for(UserData1 ud : list11) {
			   System.out.println("age :" + ud.getAge() + "roll number=" + ud.getRollNumber() + "  "+ud.getName());
			   
	     }
	   }	   
	}
}



