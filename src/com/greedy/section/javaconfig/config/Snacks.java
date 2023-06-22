package com.greedy.section.javaconfig.config;

public class Snacks extends Product{
	private int price;

	public Snacks() {
	}

	public Snacks(String kind, String commentary , int price) {
		super(kind, commentary);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Snacks [price=" + price + "]";
	}
	
	
	
	
	
	

}
