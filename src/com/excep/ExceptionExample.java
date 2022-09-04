package com.excep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {
	static String name;
	
	public static void main(String[] args) throws IOException
	{
		int a = 10;
		try {
			System.out.println(name.length());
			int result = a/0;
			System.out.println(result);
		}catch(ArithmeticException ex) {
			System.out.println("Arithmetic exception");
		}catch(NullPointerException ex) {
			System.out.println("Runtime Exception exception");
		}catch(RuntimeException ex) {
			System.out.println("Runtime Exception exception");
		}finally{
			System.out.println("Finally Executed");
		}
		
		System.out.println("Execution Done");
		
		test2(null);
	}
	
	
	public static void test() throws IOException {
		  // File path is passed as parameter
        File file = new File(
            "C:\\Users\\pankaj\\Desktop\\test.txt");
        
	    BufferedReader br
	            = new BufferedReader(new FileReader(file));
	    String st;      
	    while ((st = br.readLine()) != null) 
	        System.out.println(st);  
	}
	
	public static void test2(String str) throws IOException {
		if(str == null)
			throw new IOException("testing");
	}
}


// Checked 
// Unchecked


// Exception Handling 
// try catch finally
// throw, throws



// launch browser
// navigate url
// click on login button
// enter user name 
// enter password
// click on login button
// Verify user login successfully


// scenario should be bug free (1 manually)


// Selenium WebDriver

// Selenium IDE
// Selenium RC -- Multiple programming language --- Remote Server, client 
// Selenium Grid -- Remotely 
// Selenium Webdriver -- 
// 


// Maven -- 




