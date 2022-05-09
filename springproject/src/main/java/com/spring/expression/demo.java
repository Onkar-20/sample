package com.spring.expression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Demo")
public class demo {
	
	@Value("#{11+22}")
	private int x;
	
	@Value("#{5+3+4+1}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int z;
	
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	
	@Value("#{new java.lang.String('Onkar Deshmukh')}")
	private String name;
	
	@Value("#{8>3}")
	private boolean isActive;
	
	@Override
	public String toString() {
		return "demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}



	public double getE() {
		return e;
	}
	
	

	public void setE(double e) {
		this.e = e;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

}
