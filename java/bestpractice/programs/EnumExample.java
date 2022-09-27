package com.sebone.java.bestpractice.programs;

public  class EnumExample {
	enum Color {
		RED,
		GREEN,
		BLUE;
		int value;
		//Color(int value) {
		//	this.value = value;
		//}
	}
	public static void main(String[] args)
	{
		// Calling values()
		Color arr[] = Color.values();
		for (Color col : arr) {
			// Calling ordinal() to find index
			System.out.println(col + " at index "+ col.ordinal());
		}
		System.out.println(Color.valueOf("RED"));
	}
}
