/**
 * 
 */
package com.sebone.java.sorting;

import java.util.ArrayList;

/**
 * @author Varsha Rane
 *
 */
public class SortingExecution {

	/**
	 * @param args 
	 * return= userData
	 */
	public UserData getuserData(int age, String name, int rollNumber  ) {
	 UserData userData = new UserData();
	 userData.setAge(age);
	 userData.setName(name);
	 userData.setRollNumber(rollNumber);
	 return userData; 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//adding elements in arraylist of userdata
		SortingExecution sortingExecution = new SortingExecution();
		ArrayList<UserData> userDataList = new 	ArrayList<UserData>(); 
		UserData userData1 = sortingExecution.getuserData(21," saloni", 101);
		userDataList.add(userData1);
		UserData userData2 = sortingExecution.getuserData(22,"Varsha",102);
		userDataList.add(userData2);
		userDataList.add(sortingExecution.getuserData(22, "shital", 103));
		userDataList.add(sortingExecution.getuserData(23,"Danish", 104));
		userDataList.add(sortingExecution.getuserData(24, "rajnandini",105));
		UserData userData3 = sortingExecution.getuserData(25,"faran", 0);
		userDataList.add(userData3);
		
//		display elements
        for(UserData userData :userDataList ) {
        	System.out.println(userData.getName()  + "  "+userData.getRollNumber() + "  "+userData.getAge());

        }
        for(int i=0;i<userDataList.size();i++ ) {
        	UserData userData = userDataList.get(i);
        	//System.out.println(userDataList);
        	System.out.println(userData.getName()  + "  "+userData.getRollNumber() + "  "+userData.getAge());

        }
 
	}

}
