/**
 * 
 */
package com.sebone.java.practicebyuserdata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @author Varsha Rane
 *
 */
public class MainDataOfCity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object create and values passed using set
		DataOfCity dataOfCity1 = new DataOfCity();
		dataOfCity1.setName("Varsha");
        dataOfCity1.setCity("khargone");
        
        DataOfCity dataOfCity2 = new DataOfCity();
		dataOfCity2.setName("Prachi");
        dataOfCity2.setCity("khargone");
        
        DataOfCity dataOfCity3 = new DataOfCity();
		dataOfCity3.setName("Sejal");
        dataOfCity3.setCity("Anjad");
        
        DataOfCity dataOfCity4 = new DataOfCity();
		dataOfCity4.setName("Sohail");
        dataOfCity4.setCity("Indore");
        
        DataOfCity dataOfCity5 = new DataOfCity();
		dataOfCity5.setName("Gipsy");
        dataOfCity5.setCity("khandwa");
        
 //       incorrect way for storing multiple key  values  
//        HashMap<String,DataOfCity> hashmap = new HashMap<String,DataOfCity>();
//        hashmap.put(dataOfCity1.getCity(), dataOfCity1);
//        hashmap.put(dataOfCity2.getCity(), dataOfCity2);
//        hashmap.put(dataOfCity3.getCity(), dataOfCity3);
//        hashmap.put(dataOfCity4.getCity(), dataOfCity4);
//        hashmap.put(dataOfCity5.getCity(), dataOfCity5);
//        giving data of keys in a set
//        Set<String> keys = hashmap.keySet();
//        System.out.println();
        
       
        ArrayList<DataOfCity> list1 = new ArrayList<DataOfCity>();
        list1.add(dataOfCity1);
        list1.add(dataOfCity2);
        ArrayList<DataOfCity> list2 = new ArrayList<DataOfCity>();
        list2.add(dataOfCity3);
        ArrayList<DataOfCity> list3 = new ArrayList<DataOfCity>();
        list1.add(dataOfCity4);
        ArrayList<DataOfCity> list4 = new ArrayList<DataOfCity>();
        list1.add(dataOfCity5);
        
        //to display all unique keys with multiple values
        HashMap<String,ArrayList<DataOfCity>> hashmap = new  HashMap<String,ArrayList<DataOfCity>>();
        hashmap.put(dataOfCity1.getCity(), list1);
        hashmap.put(dataOfCity3.getCity(), list2);
        hashmap.put(dataOfCity4.getCity(), list3);
        hashmap.put(dataOfCity5.getCity(), list4);
        
        //size of list1, list2 and hashmap
        System.out.println(" size of hashmap"+ hashmap.size());
		System.out.println("size of list1  ="+ list1.size());
		System.out.println("size of list2  ="+ list2.size());
		
		//display data
        Set<String> keys = hashmap.keySet();
        // keyset se key dege hashmap se leke and assign in set keys
        for(String key : keys) {
        	ArrayList<DataOfCity> data= hashmap.get(key);   //set key values ka usmese ek -ek key assign hogi arraylist k data variable me
        	for(DataOfCity d : data) {//iterate hoga data  arraylist mese 
        	   System.out.println("city name :"+ d.getCity() + " name of person :" + d.getName());
        }
        
        
        
        
	}

	}
}	
