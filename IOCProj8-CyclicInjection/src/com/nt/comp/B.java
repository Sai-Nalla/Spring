package com.nt.comp;

public class B {
	private A a;

	public B() {
		System.out.println("B.0-Param Constructor");
	}
	
	public B(A a) {
		System.out.println("B.0-Param Constructor");
		this.a=a;
	}
	public void setA(A a) {
		this.a = a;
	}

	public A getA() {
		return a;
	}

	@Override
	public String toString() {
		return "B [a=";
	}
	

}
