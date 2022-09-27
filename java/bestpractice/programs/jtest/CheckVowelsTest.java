/**
 * 
 */
package com.sebone.java.bestpractice.programs.jtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sebone.java.bestpractice.programs.CheckVowels;

/**
 * @author Varsha Rane
 *
 */
public class CheckVowelsTest {

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
	public void test() {
		CheckVowels checkVowels = new  CheckVowels();
		assertEquals(true, checkVowels.getVowels("varsha"));
		
	}
	public void test2() {
		CheckVowels checkVowels = new  CheckVowels();
		String name = "sfgj";
		assertEquals(false, checkVowels.getVowels(name));

	}

}
