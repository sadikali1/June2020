package com.cons;

public interface IExample1 extends IExample2, IExample3{
	
	int a = 10;
	
	void print();
	
	void accptAler();
	
	default void test(){
		
	}
	
	static void test1() {
		System.out.println("Testing");
	}

	private void method() {
		System.out.println("test");
	}
}


// 100 % abstraction