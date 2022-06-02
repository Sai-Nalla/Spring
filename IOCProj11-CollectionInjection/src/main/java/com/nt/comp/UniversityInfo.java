package com.nt.comp;

import java.util.Date;
import java.util.Map;

public class UniversityInfo {
	private Map<Integer,String> facultyDetails;
	private Map<String,Date> datesInfo;
	public UniversityInfo(Map<Integer, String> facultyDetails, Map<String, Date> datesInfo) {
		super();
		this.facultyDetails = facultyDetails;
		this.datesInfo = datesInfo;
	}
	@Override
	public String toString() {
		return "UniversityInfo [facultyDetails=" + facultyDetails + ", datesInfo=" + datesInfo + "]";
	}
	

}
