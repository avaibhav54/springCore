package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class khsta {
	
	private int price;

	@Override
	public String toString() {
		return "khsta [price=" + price + "]";
	}

	public khsta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@PostConstruct
	public void start() {
		System.out.println("start h ogya mai");
	}
	@PreDestroy
	public void end() {
		System.out.println("bnd ho ja");
	}
}
