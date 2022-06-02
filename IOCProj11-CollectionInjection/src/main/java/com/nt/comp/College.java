package com.nt.comp;

import java.util.Date;
import java.util.List;

public class College {
	private List<String> studName;
	private List<Date> dates;
	public void setStudName(List<String> studName) {
		this.studName = studName;
	}
	public void setDates(List<Date> dates) {
		this.dates = dates;
	}
	@Override
	public String toString() {
		return "College [studName=" + studName + ", dates=" + dates + "]";
	}
	

}
