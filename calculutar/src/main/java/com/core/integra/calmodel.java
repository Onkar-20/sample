package com.core.integra;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class calmodel {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	private String t1;
	private String t2;
	private String m1;
	
	
	public calmodel(String t1, String t2, String m1) {
		super();
		this.t1 = t1;
		this.t2 = t2;
		this.m1 = m1;
	}
	public String getT1() {
		return t1;
	}
	public void setT1(String t1) {
		this.t1 = t1;
	}
	public String getT2() {
		return t2;
	}
	public void setT2(String t2) {
		this.t2 = t2;
	}
	public String getM1() {
		return m1;
	}
	public void setM1(String m1) {
		this.m1 = m1;
	}
	@Override
	public String toString() {
		return "calmodel [t1=" + t1 + ", t2=" + t2 + ", m1=" + m1 + "]";
	}

}
