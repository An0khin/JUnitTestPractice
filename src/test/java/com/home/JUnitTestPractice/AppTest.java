package com.home.JUnitTestPractice;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {
	@BeforeClass
	public static void setUpClass() {
		System.out.println("Begin");
	}
	
	@Before
	public void setUp() {
		System.out.println("Hehe");
	}
	
	@Test
	public void test() {
		assertEquals("Hello", App.hello());
	}
	
	@Test
	public void testFact() {
		assertEquals(6, App.factorial(3));
		assertEquals(24, App.factorial(4));
	}
	
	@After
	public void tearDown() {
		System.out.println("Not hehe");
	}
	
	@AfterClass
	public static void tearDownClass() {
		System.out.println("End");
	}
}
