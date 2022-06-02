package com.nt.comp;

import java.util.Date;

public class PersonInfo {
	private Long acno;
	private String name;
	private Date dob;
	private Date doj;
	private Date dom;
	
	public PersonInfo(Long acno, String name, Date dob, Date doj, Date dom) {

		this.acno = acno;
		this.name = name;
		this.dob = dob;
		this.doj = doj;
		this.dom = dom;
	}

	@Override
	public String toString() {
		return "PersonInfo [acno=" + acno + ", name=" + name + ", dob=" + dob + ", doj=" + doj + ", dom=" + dom + "]";
	}

	
}
