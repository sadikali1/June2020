package com.cons;

public class ABChild extends ABExample implements IExample1 {
	
	public int sum(int a, int b) {
		int result = a+ b;
		return result;
	}

	
	public void print() {
		System.out.println("Interface method implememted");
	}


	@Override
	public void printSecondInterface() {	
		System.out.println("Second interface method implemented");		
	}


	@Override
	public void accptAler() {
				
	}

}
