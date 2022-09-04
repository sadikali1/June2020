package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ExampleAssert {
	
	@Test
	public void assertTest() {
		
		Assert.assertEquals("dev", "dev", "Values are  not equals");
		Assert.assertEquals(10, 10);
		
		Assert.assertNotEquals(10, 30);
		Assert.assertTrue(true, "Failed due to false ");
		System.out.println("After Assertion");
	}

	
	@Test
	public void softAssertTest() {
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals("dev1", "dev");
		softAssert.assertEquals(10, 10);
		
		softAssert.assertNotEquals(30, 30);
		softAssert.assertTrue(true);
		System.out.println("After Assertion");
		//softAssert.assertAll();
	}

}


// Two types of assertion
// Hard Assertion
// Soft Assertion
