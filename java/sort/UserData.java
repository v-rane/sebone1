package com.sebone.java.sort;

public class UserData {
  int rollNumber;
  String name;
  int age;
  
  public void setRollNumber(int rollNumber) {
	  this.rollNumber = rollNumber;
  }
  
  public int getRollNumber() {
	  return this.rollNumber;
  }
  
  public void setName(String name) {
	 this.name =name; 
 }
  
  public String getName() {
	  return this.name;
  }
  public void setAge(int age) {
	  this.age= age;
  }
  
  public int getAge() {
	  return this.age;
	  
  }
  public String toString() {
	  return this.rollNumber + " " + this.name + " " + this.age;
  }

public String compareTo(UserData o2) {
	// TODO Auto-generated method stub
	return null;
}
}


