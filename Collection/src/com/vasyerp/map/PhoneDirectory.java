package com.vasyerp.map;

public class PhoneDirectory {
	long number;
	String name;
	public PhoneDirectory(long number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	@Override
	public String toString() {
		return "PhoneDirectory [number=" + number + ", name=" + name + "]";
	}
	
}
