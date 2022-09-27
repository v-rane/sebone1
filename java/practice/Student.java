package com.sebone.java.practice;

public class Student extends Person{
		
	//extended class of parent 

		
		int rollNumber;
		String grade;
		
		int getrollNumber() {
		  return this.rollNumber;
		}
			
		String getGrade() {
			return this.grade;
		}
			
		public void setGrade(String grade) {
			this.grade = grade;
		}
		  
		public void setrollNumber(int rollNumber) {
		   	this.rollNumber = rollNumber;
		   }
}


