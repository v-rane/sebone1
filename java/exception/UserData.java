package com.sebone.java.exception;

public class UserData {
	

	 int rollNumber;
	  String name;
	  int age;
	  
	  public void setRollNumber(int rollNumber) {
		  this.rollNumber = rollNumber;
	  }
	  
	  int getRollNumber() {
		  return this.rollNumber;
	  }
	  
	  public void setName(String name) {
		 this.name =name; 
	 }
	  
	  String getName() {
		  return this.name;
	  }
	  public void setAge(int age)throws OutOfRangeExeception {
		  if(age>75)
			  throw new OutOfRangeExeception("Age should be below 75");
		  else {
		  this.age= age;
		  }
	  }
	  
	  int getAge() {
		  return this.age;
		  
	  }
	 

}
