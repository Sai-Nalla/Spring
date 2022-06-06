package com.nt.beans;

public class ProfessionalCricketer {
	private String name;
	private CricketBat bat;
	public ProfessionalCricketer() {
		System.out.println("ProfessionCricketer  0 param Constructor");
	}
	
	public ProfessionalCricketer(String name, CricketBat bat) {
		System.out.println("ProfessionCricketer  1 param Constructor");
		this.name = name;
		this.bat = bat;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setBat(CricketBat bat) {
		this.bat = bat;
	}
	@Override
	public String toString() {
		return "ProfessionalCricketer [name=" + name + ", bat=" + bat + "]";
	}
	

}
