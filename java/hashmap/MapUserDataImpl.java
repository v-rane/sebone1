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
public abstract class MapUserDataImpl  implements MapUserData{
	
	public HashMap<Integer,String> mapbyValue(ArrayList<UserData> userDataList){
	  HashMap<Integer,String> userDataMap = new HashMap<Integer,String>();
	    for(UserData userData : userDataList) {
		  userDataMap.put(userData.getRollNumber(),userData.getName());
	}
	return userDataMap ;
}
}
