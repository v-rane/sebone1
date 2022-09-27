package com.sebone.java.sort;

import java.util.ArrayList;

public class SortingExecution {
	
	//private static final int getUserData = 0;
	public UserData getUserData(int rollNumber,int age,String name) {
		UserData userData= new UserData();
		userData.setAge(age);
		userData.setName(name);
		userData.setRollNumber(rollNumber);
		return userData;
	}
	//executor function
	public static void main(String[] args) {
		SortingExecution sortingExecution = new SortingExecution();
		//creating objects of userdata class to genrate data
		ArrayList<UserData> userDataList = new ArrayList<UserData>();
		//storing userdata object in local object which is returned by method
		UserData userData1 = sortingExecution.getUserData(103,22,"Varsha");
		//adding objects in arraylist which is returned by method
		userDataList.add(userData1);
		UserData userData2 = sortingExecution.getUserData(102, 20, "Sakshi");
		userDataList.add(userData2);
		userDataList.add(sortingExecution.getUserData(104, 21, "Shital"));
		userDataList.add(sortingExecution.getUserData(105, 19, "umesh"));
		userDataList.add(sortingExecution.getUserData(101,18,"nitin"));
		
		for(int i=0; i<userDataList.size(); i++) {
			UserData userData = userDataList.get(i);
			System.out.println(userData.getName()  + "  "+userData.getRollNumber() + "  "+userData.getAge());
		}
		
		
		SortUserDataImpl sortUserDataImpl = new SortUserDataImpl();
		ArrayList<UserData> newUserList =  sortUserDataImpl.sort(userDataList);
		
		System.out.println("Sorted user data list according to rollNumber : ");
		for(UserData userData : newUserList) {
			System.out.println(userData.getName()  + "  "+userData.getRollNumber() + "  "+userData.getAge());
			
		}
		
		SortUserDataImpl sortUserDataImpl1 = new SortUserDataImpl();
		ArrayList<UserData> newUserList1 = sortUserDataImpl1.sort(userDataList);
		
		System.out.println("Sorted user data list according to age : ");
		
		for(UserData userData : newUserList1) {
			System.out.println(userData.getName()  + "  "+userData.getRollNumber() + "  "+userData.getAge());

		}
		SortUserDataImpl sortUserDataImpl2 = new SortUserDataImpl();
		ArrayList<UserData> newUserList2 = sortUserDataImpl2.sort(userDataList);
		
		System.out.println("Sorted user data list according to name : ");
		
		for(UserData userData : newUserList2) {
			System.out.println(userData.getName()  + "  "+userData.getRollNumber() + "  "+userData.getAge());

		}

	}
}
