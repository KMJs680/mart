package com.greedy.section.javaconfig.config;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
	
	private List<Product> items;
	private int price;
	
	public void addItem(Product item) {
		this.items.add(item);
	}


	public ShoppingCart() {
		this.items = new ArrayList<Product>();
	}
	

	public void getItems() {
		for(Product product : items) {
			System.out.println(product.getKind() + "\n");
		}
	}
	
	public void getPrice(Product item) {
		this.items = new ArrayList<Product>();
		items.add(price, item);
	}

	public void getSum() {
		int sum =0;
		for(Product product : items) {
			sum += product.getPrice();
			System.out.println(sum);
		}
	
		
		
	}






	@Override
	public String toString() {
		return "ShoppingCart [items=" + items + "]";
	}
	
	
	
	
	
	

}
