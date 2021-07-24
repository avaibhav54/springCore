package com.springcore.collections;

import java.awt.List;
import java.util.*;
public class emp {
	private String name;

	private Set<String> address;
	private Map<String,String>courses;
	private ArrayList<String> phones;
	@Override
	public String toString() {
		return "emp [name=" + name + ", address=" + address + ", courses=" + courses + ", phones=" + phones + "]";
	}
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public emp(String name, Set<String> address, Map<String, String> courses, ArrayList<String> phones) {
		super();
		this.name = name;
		this.address = address;
		this.courses = courses;
		this.phones = phones;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public ArrayList<String> getPhones() {
		return phones;
	}
	public void setPhones(ArrayList<String> phones) {
		this.phones = phones;
	}
	
	
}
