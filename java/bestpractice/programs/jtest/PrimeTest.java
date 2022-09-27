/**
 * 
 */
package com.sebone.java.bestpractice.programs.jtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sebone.java.Prime;

/**
 * @author Varsha Rane
 *
 */
class PrimeTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.sebone.java.Prime#isPrimeNum(int)}.
	 */
	@Test
	void testIsPrimeNum() {
	Prime prime=new Prime();
	assertEquals(true,Prime.isPrimeNum(3));
		
	}
	void testIsPrimeNum1() {
	Prime prime=new Prime();
	assertEquals(false,Prime.isPrimeNum(1));
	}
	void testIsPrimeNum2() {
		Prime prime=new Prime();
		assertEquals(false,Prime.isPrimeNum(123));
		}
	void testIsPrimeNum3() {
		Prime prime=new Prime();
		assertEquals(false,Prime.isPrimeNum(1145));
		}
}
