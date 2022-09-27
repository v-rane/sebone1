package com.sebone.java.practice;

import java.util.TreeSet;

public class NullValueTest {
	public static void main(String [] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		//tree.add(null);
		tree.add(1);
		tree.add(3);
		tree.add(3);
		tree.add(4);
		tree.add(6);
		tree.add(2);//sorted form me aara h
		System.out.println(tree); 
		System.out.println(tree.last());
		System.out.println(tree.size()+" " + tree.hashCode());
		tree.addAll(tree);
		tree.remove(3);
		System.out.println(tree);
		
		System.out.println(tree.removeAll(tree));
		System.out.println(tree);
		
		
	}

}
