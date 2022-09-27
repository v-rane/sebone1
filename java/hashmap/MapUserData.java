/**
 * 
 */
package com.sebone.java.hashmap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Varsha Rane
 *
 */

public interface MapUserData {
	public HashMap<Integer,String> mapByValue(ArrayList<UserData>userDataList);
	public HashMap<String,UserData> mapByName(ArrayList<UserData> userDataList);
	
	
}
