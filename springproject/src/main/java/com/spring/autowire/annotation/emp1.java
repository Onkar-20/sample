package com.spring.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class emp1 {
	@Qualifier("address2")
	@Autowired
	private Address1 address;

	public emp1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address1 getAddress() {
		return address;
	}

	public void setAddress(Address1 address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "emp [address=" + address + "]";
	}

	public emp1(Address1 address) {
		super();
		this.address = address;
	}
	

}
