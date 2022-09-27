package com.sebone.java.hashmap;

import java.util.HashMap;
import java.util.Set;

public class PinCode {
	public static void main(String[] args) {
	HashMap<Integer,String> pinCode = new HashMap<Integer,String>();
	pinCode.put(451001 , "khargone");
	pinCode.put(451003 , "jalandar");
	pinCode.put(451005, "haridwar");
	pinCode.put(451007, "yashwantgarh");
	pinCode.put(451301, "Jalandar");
	
	Set<Integer> key= pinCode.keySet();
	for (Integer pin : key) {
		String CityName = pinCode.get(pin);
		System.out.println("Pincode=" + pin+ " " + "City name= "+ CityName);
	}
	
	
	
	
	}	

}


