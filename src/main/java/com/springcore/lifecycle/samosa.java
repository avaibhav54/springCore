package com.springcore.lifecycle;

public class samosa {

	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "samosa [price=" + price + "]";
	}
	public void init() {
		System.out.println("init ke andr hu");
	}
	public void destroy() {
		System.out.println("destroy kr de re baba");
	}
}
