package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String generateMessage(String user) {
		System.out.println("WishMessageGenerator.generateMessage()");
		int hour=0;
		hour=date.getHours();
		if(hour<12)
			return "Good Morning"+user;
		else if(hour<16)
			return "Good Afteernoon"+user;
		else if(hour<20)
			return "Good Evening"+user;
		else 
			return "Good Night"+user;

	}
}
