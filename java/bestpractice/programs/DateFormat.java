/**
 * 
 */
package com.sebone.java.bestpractice.programs;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime; 

/**
 * @author Varsha Rane
 * @objective - How to print date in specific format?
 *
 */
public class DateFormat {

	public String getDateInFormat() {	
	/**
	 * @methodName
	 * @objective -  to get date in specific format
	 * @param args
	 */
		
	 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	 LocalDateTime now = LocalDateTime.now();
	// System.out.println(dtf.format(now));
	 return dtf.format(now);
	}
	
	public static void main(String[] args) {
	System.out.println("The Date in specific format");
	DateFormat dateFormat = new DateFormat();
	String currentDate =dateFormat.getDateInFormat();
	System.out.println(currentDate);
	
	
		
	}

}
