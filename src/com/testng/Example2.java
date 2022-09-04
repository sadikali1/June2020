package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example2 {
		
	@Test(priority = 1, dependsOnMethods = { "testDemo4"}, alwaysRun = true)
	public void testDemo3() {
		System.out.println("Test demo 3");
	}

	@Test(priority = 4, description = "This is login tests", enabled = false)
	public void testDemo2() {
		System.out.println("Test demo 2");
		//Assert.assertEquals(false, true);
	}
	
	@Test(priority = 2)
	public void testDemo4() {
		System.out.println("Test demo 4");
	}

	@Test(priority = 4)
	public void testDemo1() {
		System.out.println("Test demo 1");
	}
	
	
}


// Adding product  -- first 2
// Edit product 	-- update 2
// Delete product -- delete 2
