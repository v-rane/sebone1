package com.sebone.java.practice;

import java.util.LinkedList;

public class MakeupList {
	public static void main (String [] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("eyeliner");
		list.addLast("primer");
		list.addFirst(" mascara");
		list.add("fash wash");
		list.add("hair oil");
		list.add("eye shadow");
		list.add("fish oil");
		System.out.println(list);

		list.addAll(list);
		System.out.println(list);
		
		list.remove("fish oil");
		System.out.println(list);

		list.add(3,"eye lashes");
		System.out.println(list);
		
		for(String s :list) {
			System.out.println(s);

		}

	}

}
