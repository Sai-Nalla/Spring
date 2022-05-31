package com.nt.comp;

public class Student {
	private int sno;
	private String sname;
	private String addr;
	private float avg;
	
	public Student() {
		System.out.println("Student with 0-Param Constructor.Student()");
	}
	public Student(int sno, String sname, String addr, float avg) {
		System.out.println("Student Parameterized Constructor");
	
		this.sno = sno;
		this.sname = sname;
		this.addr = addr;
		this.avg = avg;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", addr=" + addr + ", avg=" + avg + "]";
	}

	
}
