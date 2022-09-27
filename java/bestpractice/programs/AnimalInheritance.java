/**
 * 
 */
package com.sebone.java.bestpractice.programs;

/**
 * @author Varsha Rane
 *
 */
public class AnimalInheritance {

	/**
	 * @objective -Write a Program to showcase inheritance?
	 */ 
	void eat(){
		System.out.println("eating...");
	} 
	public static void main(String args[]){  
		BabyDog d=new BabyDog();  
		d.weep();  
		d.bark();  
		d.eat();  
	}
}
class Dog extends AnimalInheritance{  
    void bark(){
    	System.out.println("barking...");}  
	} 

class BabyDog extends Dog{  
	void weep(){
		System.out.println("weeping...");}  
 
} 