package com.sebone.java.bestpractice.programs.jtest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sebone.java.bestpractice.programs.RemoveLeadTrailSpaces;

class TrimNameTest {

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
		RemoveLeadTrailSpaces removeLeadTrailSpaces = new RemoveLeadTrailSpaces();
		assertEquals("varsha", removeLeadTrailSpaces.trimName("   varsha   "));

	}

}
