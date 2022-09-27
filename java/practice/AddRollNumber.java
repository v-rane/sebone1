package com.sebone.java.practice;

import java.util.HashSet;

public class AddRollNumber {

	public static void main(String [] args) {
		HashSet<Integer> rollNum = new HashSet<Integer>();
		rollNum.add(1);
		rollNum.add(3);
		rollNum.addAll(rollNum);
		rollNum.add(null);
		rollNum.add(1);
		rollNum.add(4);
		System.out.println(rollNum);
		System.out.println("size" + rollNum.size());

		System.out.println("rollnum="+ rollNum.contains(null));
		rollNum.clear();
		System.out.println(rollNum);
		if(rollNum.isEmpty()) {
			System.out.println("list is empty");
		}
		else
		{
			System.out.println("not empty");
		}
	}
}
