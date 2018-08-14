package com.cqjy.entity;

public class User {

	private String stname;

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}
	
	public void hello() {
		System.out.println("hello:"+stname);
	}
}
