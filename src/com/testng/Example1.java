package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Example1 {
	
	String str;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite is executed");
	}
	
	@AfterSuite
	public void afterSuite() {		
		// send report to email
		System.out.println("After suite is executed");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test executed");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test executed");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class executed");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class executed");
	}
	
	@Test
	public void testExample1() {
		System.out.println("Test 1");
	}

	@Test
	public void testExample2() {
		System.out.println("Test 2");
	}
	

	@BeforeMethod
	public void aa() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void aa1() {
		System.out.println("After method");
	}
	
	@Test
	public void testExample3() {
		System.out.println("Test 3");
	}
}


// Junit, Junit 5, TestNG