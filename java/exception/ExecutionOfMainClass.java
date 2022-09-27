package com.sebone.java.exception;

import java.util.ArrayList;

public class ExecutionOfMainClass {

	public UserData getUserData(int age,String name,int rollNumber) {
		UserData userData= new UserData();
		try {
			userData.setAge(age);
		} catch (OutOfRangeExeception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userData.setName(name);
		userData.setRollNumber(rollNumber);
		return userData;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//adding elements in arraylist of userdata
		ExecutionOfMainClass executionOfMainClass = new ExecutionOfMainClass();
		ArrayList<UserData> userDatalist = new ArrayList<UserData>(); 

		UserData userData1 = executionOfMainClass.getUserData(21," saloni", 101);
		userDatalist.add(userData1);
		UserData userData2 = executionOfMainClass.getUserData(22,"null",102);
		userDatalist.add(userData2);
		userDatalist.add(executionOfMainClass.getUserData(23, "shital", 103));
		userDatalist.add(executionOfMainClass.getUserData(86,"Danish", 104));
		userDatalist.add(executionOfMainClass.getUserData(24, "harsh",105));
		UserData userData3 = executionOfMainClass.getUserData(25,"faran", 106);
		userDatalist.add(userData3);
		
		for(int i=0 ;i< userDatalist.size();i++) {
			UserData userData = userDatalist.get(i);
        	System.out.println(userData.getName()  + "  "+userData.getRollNumber() + "  "+userData.getAge());

        	
			
		}
	}

}
