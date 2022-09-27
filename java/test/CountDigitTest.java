package com.sebone.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountDigitTest {

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
	void testCountDigitTest(){
	CountDigit countDigit = new CountDigit() ;
	assertEquals(2,CountDigit.countDigits(34));
	}
    
	void testCountDigitTest1(){
		CountDigit countDigit = new CountDigit() ;
		assertEquals(4,CountDigit.countDigits(3457));
		}
}
