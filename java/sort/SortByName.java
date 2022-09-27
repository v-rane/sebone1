package com.sebone.java.sort;

import java.util.Comparator;

public class SortByName implements Comparator<UserData>{

		public int CompareTo(UserData o1, UserData o2) {
		// TODO Auto-generated method stub
			
			return o1.getName().compareTo(o2.getName()) ;
		}

		@Override
		public int compare(UserData o1, UserData o2) {
			// TODO Auto-generated method stub
			return 0;
		}

	
		

	}

	
	

