package com.sebone.java.sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortUserDataImpl implements SortUserData  {
  //implementing sort method
	public ArrayList<UserData> sortByRollNumber(ArrayList<UserData>userData){
		Collections.sort(userData, new SortByRollNumber());
		return userData;
	}
	
	public ArrayList<UserData> sortByAge(ArrayList <UserData>userData){
		Collections.sort(userData, new SortByAge());
		return userData;
	}

	public ArrayList<UserData> sortByName(ArrayList<UserData>userData){
		Collections.sort(userData, new SortByName());
		return userData;
	}

	@Override
	public ArrayList<UserData> sort(ArrayList<UserData> UserDataList) {
		// TODO Auto-generated method stub
		return null;
	}

}
