package com.sebone.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testReverseTest() {
		Reverse reverse=new Reverse();
		assertEquals("gab",reverse.reverseString("bag"));
		
	}
	void testReverseTest2() {
		Reverse reverse=new Reverse();
		assertEquals("elppa",reverse.reverseString("apple"));
		
	}
   
}

