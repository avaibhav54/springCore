package com.springcore.auto.wiring;

import org.springframework.beans.factory.annotation.Autowired;

public class employee {
	
	private address ad;

	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employee(address ad) {
		System.out.println("insiode constructor");
		this.ad=ad;
	}

	@Override
	public String toString() {
		return "employee [ad=" + ad + "]";
	}
	public address getAd() {
		return ad;
	}

	public void setAd(address ad) {
		this.ad = ad;
	}

	
}
