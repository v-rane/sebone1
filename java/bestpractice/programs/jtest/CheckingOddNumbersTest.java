package com.sebone.java.bestpractice.programs.jtest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sebone.java.bestpractice.programs.CheckingOddNumbers;

class CheckingOddNumbersTest {

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
	void test() {
		CheckingOddNumbers checkingOddNumbers = new CheckingOddNumbers();
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(3);
		list.add(9);
		list.add(7);
		list.add(5);
		list.add(17);
		assertEquals( true,checkingOddNumbers.checkOddNumberList(list));
	}
	
	void test1() {
		CheckingOddNumbers checkingOddNumbers = new CheckingOddNumbers();
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(7);
		list.add(5);
		list.add(17);
		assertEquals( false,checkingOddNumbers.checkOddNumberList(list));
	}

}
