package com.nt.comp;

import java.util.Date;
import java.util.Set;

public class ContactsInfo {
	private Set<Long> Phoneno;
	private Set<Date> dates;

	public void setPhoneno(Set<Long> phoneno) {
		Phoneno = phoneno;
	}

	public void setDates(Set<Date> dates) {
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "ContactsInfo [Phoneno=" + Phoneno + ", dates=" + dates + "]";
	}

	
	

}
