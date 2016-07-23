package com.vinay.practice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestJunit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Hello");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Hello");

	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Hello");

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Hello");

	}

	@Test
	public void test() {
		Assert.assertTrue(true);
	}

}
