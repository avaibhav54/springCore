package com.springcore.standalone;

import java.util.HashMap;
import java.util.List;
import java.util.Properties;

public class person {

	private List<String> name;

	private HashMap<String,Integer> fees=new HashMap<String, Integer>();
	
	private Properties property;
	
	public HashMap<String, Integer> getFees() {
		return fees;
	}

	public void setFees(HashMap<String, Integer> fees) {
		this.fees = fees;
	}

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	public Properties getProperty() {
		return property;
	}

	public void setProperty(Properties property) {
		this.property = property;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", fees=" + fees + ", property=" + property + "]";
	}
	



	
}
