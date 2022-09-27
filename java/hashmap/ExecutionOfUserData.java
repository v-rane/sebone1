/**
 * 
 */
package com.sebone.java.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @author Varsha Rane
 *
 */
public class ExecutionOfUserData {

	public UserData getUserData(int rollNumber,String name, int age) {
		UserData userData = new UserData();
		userData.setAge(age);
		userData.setRollNumber(rollNumber);
		userData.setName(name);
		return userData;
	}
	public static void main(String[] args) {
		ExecutionOfUserData executionOfUserData = new ExecutionOfUserData();
		HashMap<Integer,UserData> userDataMap = new HashMap<Integer,UserData>();
	    UserData userData1 = executionOfUserData.getUserData(10, "Varun",22);
        userDataMap.put(userData1.getRollNumber(),userData1);
        UserData userData2 = executionOfUserData.getUserData(20,"shaily",32);
        userDataMap.put(userData2.getRollNumber(), userData2);
        UserData userData3 = executionOfUserData.getUserData(30,"Daisy",76);   
        userDataMap.put(userData3.getRollNumber(),userData3);
        UserData userData4 = executionOfUserData.getUserData(40, "veronica", 21);
        userDataMap.put(userData4.getRollNumber(),userData4);
        UserData userData5 = executionOfUserData.getUserData(50, "harsh", 67);
        userDataMap.put(userData5.getRollNumber(), userData5);
        
       
        Set<Integer> KeyList = userDataMap.keySet();
        for(Integer i : KeyList){
        	UserData user = userDataMap.get(i);
        	
        	System.out.println("key =" +i +" name =" + user.getName() +" age "+ user.getAge());
        }
        	
        
		
	}
}
          