package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;

static {
	System.out.println("WishMessageGenerator.  static block");
}
	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator.---WishMessageGenerator()");
		this.date = date;
	}

	public void Wish(String user) {
		int hour=date.getHours();
		if(hour<12)
			System.out.println("GoodMorning "+user);
		else if(hour<16)
			System.out.println("GoodAfteernoon"+user);
		else if(hour<20)
			System.out.println("GoodEvening "+user);
		else
			System.out.println("GoodNight "+user);
	}

}
