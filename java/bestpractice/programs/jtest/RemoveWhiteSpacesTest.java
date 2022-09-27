package com.sebone.java.bestpractice.programs.jtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sebone.java.bestpractice.programs.RemoveWhiteSpaces;

public class RemoveWhiteSpacesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		RemoveWhiteSpaces removeWhiteSpaces = new RemoveWhiteSpaces();
		String name = "so  ha  il";
		char[] nameArray = name.toCharArray();
		assertEquals("sohail",removeWhiteSpaces.noSpaces(nameArray));

	}

}
