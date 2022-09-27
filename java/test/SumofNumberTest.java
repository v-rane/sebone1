package com.sebone.java.test;

import static org.junit.jupiter.api.Assertions.*;
import com.sebone.java.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumofNumberTest {

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
	void testSumOfNumber() {
	SumofNumber sumofNumber = new SumofNumber();
	int sum = 5050;
	assertEquals(sum , sumofNumber.sumOfNumbers(100));
	}
	void testSumOfNumber2() {
	SumofNumber sumofNumber = new SumofNumber();
	int sum = 10;
	assertEquals(sum , sumofNumber.sumOfNumbers(4));
	}
	
}
