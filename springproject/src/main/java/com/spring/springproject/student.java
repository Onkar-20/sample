package com.spring.springproject;

public class student {
	
	private int studentid;
	private String studentname;
	private String studentcity;
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "student [studentid=" + studentid + ", studentname=" + studentname + ", studentcity=" + studentcity
				+ "]";
	}
	public student(int studentid, String studentname, String studentcity) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentcity = studentcity;
	}

	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentcity() {
		return studentcity;
	}
	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}

}
