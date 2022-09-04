package com.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	@Test(dataProvider = "Data")
	public void testData(int a1, int b1, int result) {
		int a = a1;
		int b = b1;
		int expect = result;
		int sum  = a + b;
		Assert.assertEquals(sum, expect);		
	}
	
	
	@DataProvider(name="Data")
	public Object[][] getData() {
		Object[][] obj =  new Object[][] {			
			{1, 3 , 4},
			{12, 13 ,15 },
			{10, 20, 30},
			{2, 15, 17}
		};
		return obj;
	}

}



// 12 + 23 = 35
// 1+ 3 = 4