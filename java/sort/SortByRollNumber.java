package com.sebone.java.sort;

import java.util.Comparator;

public class SortByRollNumber implements Comparator<UserData> {

	@Override
	public int compare(UserData o1, UserData o2) {
		return o1.getRollNumber() - o2.getRollNumber();
	}

}
