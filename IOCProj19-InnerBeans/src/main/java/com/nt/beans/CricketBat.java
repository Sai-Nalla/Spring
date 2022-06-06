package com.nt.beans;

public class CricketBat {
	private String batname;

	public CricketBat() {
		System.out.println("Cricket aBat  0 param Constructor");
	}
	public void setBatname(String batname) {
		this.batname = batname;
	}

	public CricketBat(String batname) {
		System.out.println("Cricket aBat  1 param Constructor");
		this.batname = batname;
	}



	@Override
	public String toString() {
		return "CricketBat [batname=" + batname + "]";
	}
	

}
