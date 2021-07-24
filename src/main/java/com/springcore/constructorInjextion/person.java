package com.springcore.constructorInjextion;

public class person {

	private String name;
	private int personid;
	private certi cer;
	public person(String name, int personid,certi cer) {
		this.name = name;
		this.personid = personid;
		this.cer=cer;
		
	}
	@Override
	public String toString() {
		return this.name+"   :::   "+this.personid+"  :  "+this.cer.name;
	}
	
	
}
