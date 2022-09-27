package com.sebone.java.practice;

public class BankIntrestRate {
	int getRateOfIntrest() {
		return 0;
	}
    static class SBI extends BankIntrestRate {
    	int getRateOfIntrest() {
    		return 8;
    		
    	}
   static class UB extends BankIntrestRate {
    	int getRateOfIntrest() {
    		return 5;
    	}
    }
    public static void main( String[]args ) {
    	SBI s = new SBI();
    	UB u = new UB();
    	System.out.println(s.getRateOfIntrest());
    	System.out.println(u.getRateOfIntrest());
    	
    }
    }
    
}
