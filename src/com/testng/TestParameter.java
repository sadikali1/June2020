package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameter {
	
	@Test
	@Parameters({"UserName", "Password"})
	public void testParam(@Optional("test1") String user, @Optional("123456") String password) {
		System.out.println(user + " "+ password);
		
		
	}

}
