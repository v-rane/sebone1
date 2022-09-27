/**
 * 
 */
package com.sebone.java.sort.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sebone.java.sort.SortUserDataImpl;
import com.sebone.java.sort.UserData;

/**
 * @author Varsha Rane
 *
 */
public class SortUserDataImplTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSortByName() {
		SortUserDataImpl sortUserDataImpl = new SortUserDataImpl();
		ArrayList<UserData>userDataList1 = new ArrayList<UserData>();
		ArrayList<UserData>userDataList2 = new ArrayList<UserData>();
		UserData userData1 = new UserData();
		userData1.setRollNumber(11);
		userData1.setName("Varsha");
		userData1.setAge(21);
		
		UserData userData2 = new UserData();
		userData2.setRollNumber(21);
		userData2.setName("sakshi");
		userData2.setAge(32);
		
		UserData userData3 = new UserData();
		userData3.setRollNumber(2);
		userData3.setName("rajni");
		userData3.setAge(23);
		
		UserData userData4 = new UserData();
		userData4.setRollNumber(51);
		userData4.setName("ashvini");
		userData4.setAge(56);
		
		UserData userData5 = new UserData();
		userData5.setRollNumber(21);
		userData5.setName("gipsy");
		userData5.setAge(42);
		
		userDataList2.add(userData3);
		userDataList2.add(userData1);
		userDataList2.add(userData2);
		userDataList2.add(userData5);
		userDataList2.add(userData4);
		
		userDataList1.add(userData3);
		userDataList1.add(userData1);
		userDataList1.add(userData2);
		userDataList1.add(userData5);
		userDataList1.add(userData4);
		
		assertEquals(userDataList1,sortUserDataImpl.sortByRollNumber(userDataList2));
		
	}
	public void testSortByAge() {
		SortUserDataImpl sortUserDataImpl = new SortUserDataImpl();
		ArrayList<UserData>userDataList1 = new ArrayList<UserData>();
		ArrayList<UserData>userDataList2 = new ArrayList<UserData>();
		UserData userData1 = new UserData();
		userData1.setRollNumber(11);
		userData1.setName("Varsha");
		userData1.setAge(21);
		
		UserData userData2 = new UserData();
		userData2.setRollNumber(21);
		userData2.setName("sakshi");
		userData2.setAge(32);
		
		UserData userData3 = new UserData();
		userData3.setRollNumber(2);
		userData3.setName("rajni");
		userData3.setAge(23);
		
		UserData userData4 = new UserData();
		userData4.setRollNumber(51);
		userData4.setName("ashvini");
		userData4.setAge(56);
		
		UserData userData5 = new UserData();
		userData5.setRollNumber(21);
		userData5.setName("gipsy");
		userData5.setAge(42);
		
		userDataList2.add(userData1);
		userDataList2.add(userData2);
		userDataList2.add(userData3);
		userDataList2.add(userData4);
		userDataList2.add(userData5);
		
		userDataList1.add(userData1);
		userDataList1.add(userData2);
		userDataList1.add(userData3);
		userDataList1.add(userData4);
		userDataList1.add(userData5);
		
		assertEquals(userDataList1,sortUserDataImpl.sortByAge(userDataList2));
	
	}

	public void testSortByRollno() {
		SortUserDataImpl sortUserDataImpl = new SortUserDataImpl();
		ArrayList<UserData>userDataList1 = new ArrayList<UserData>();
		ArrayList<UserData>userDataList2 = new ArrayList<UserData>();
		UserData userData1 = new UserData();
		userData1.setRollNumber(11);
		userData1.setName("Varsha");
		userData1.setAge(21);
		
		UserData userData2 = new UserData();
		userData2.setRollNumber(21);
		userData2.setName("sakshi");
		userData2.setAge(32);
		
		UserData userData3 = new UserData();
		userData3.setRollNumber(2);
		userData3.setName("rajni");
		userData3.setAge(23);
		
		UserData userData4 = new UserData();
		userData4.setRollNumber(51);
		userData4.setName("ashvini");
		userData4.setAge(56);
		
		UserData userData5 = new UserData();
		userData5.setRollNumber(21);
		userData5.setName("gipsy");

		userData5.setAge(42);
		
		userDataList2.add(userData1);
		userDataList2.add(userData2);
		userDataList2.add(userData3);
		userDataList2.add(userData4);
		userDataList2.add(userData5);
		
		userDataList1.add(userData1);
		userDataList1.add(userData2);
		userDataList1.add(userData3);
		userDataList1.add(userData4);
		userDataList1.add(userData5);
		
		assertEquals(userDataList1,sortUserDataImpl.sortByRollNumber(userDataList2));
		
		
	}
}
