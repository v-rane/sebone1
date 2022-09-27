package com.sebone.java.hashmap;

import java.util.ArrayList;

//to print hashmap  of rollnum with userdata values
public class UserDataValue {
	
	public static void main(String [] args) {
		UserData userData1 = new UserData();
		userData1.setRollNumber(101);
		userData1.setName("varsha");
		userData1.setAge(20);
		
		UserData userData2 = new UserData();
		userData2.setAge(32);
		userData2.setName("jeson");
		userData2.setRollNumber(102);
		
		UserData userData3 = new UserData();
		userData3.setAge(55);
		userData3.setName("faran");
		userData3.setRollNumber(103);
		
		UserData userData4 = new UserData();
		userData4.setAge(42);
		userData4.setName("ganesh");
		userData4.setRollNumber(104);
		
		UserData userData5 = new UserData();
		userData5.setAge(22);
		userData5.setName("harsh");
		userData5.setRollNumber(105);
	
		ArrayList<UserData> userList = new ArrayList<UserData>();
		userList.add(userData1);
		userList.add(userData2);
		userList.add(userData3);
		userList.add(userData4);
		userList.add(userData5);


		for(UserData data : userList) {
			System.out.println(data.getAge()+ " "+data.getName() + " "+ data.getRollNumber());
		}
	}
	

	private static String getAge() {
		// TODO Auto-generated method stub
		return null;
	}

}
