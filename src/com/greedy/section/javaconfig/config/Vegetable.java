package com.greedy.section.javaconfig.config;

public class Vegetable extends Product{
	private int price;

	public Vegetable() {
	}

	public Vegetable(String kind, String commentary, int price) {
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
		return "Vegetable [price=" + price + "]";
	}
	
	


	

}
