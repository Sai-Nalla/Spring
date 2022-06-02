package com.nt.comp;

public class A {
	private B b;
	
	
	public A(B b) {
		System.out.println("A.  1-param Constructor A()");
	}
	
	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [b="+" ]";
	}

}
