package com.accessm;

public class FinalExmple {
	
	final int collegeCode;
	final static int collegeCode1;
	
	static {
		collegeCode1 = 20;
	}
	
	public FinalExmple(int a) {
		collegeCode = a;		
	}
	
	public FinalExmple() {	
		collegeCode = 30;
	}
	
	
	public void test(final int name) {
		//name = 30;
		final int a = 30;
		//a = 4;
	}
	
	public static void main(String[] args) {
		FinalExmple obj = new FinalExmple();
		obj.test(20);
	}

}
