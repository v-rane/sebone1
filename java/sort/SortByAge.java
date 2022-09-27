package com.sebone.java.sort;

import java.util.Comparator;

public class SortByAge implements Comparator<UserData>{

	@Override
	public int compare(UserData o1, UserData o2) {
		// TODO Auto-generated method stub
		
		return o1.getAge() -o2.getAge();
	}
	

}
