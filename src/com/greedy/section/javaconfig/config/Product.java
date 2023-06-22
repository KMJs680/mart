package com.greedy.section.javaconfig.config;

public class Product {
	
	private String kind;
	private String commentary;
	
	
	public Product() {
		
	}
	public Product(String kind, String commentary) {
		super();
		this.kind = kind;
		this.commentary = commentary;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getCommentary() {
		return commentary;
	}
	public void setCommentary(String commentary) {
		this.commentary = commentary;
	}
	
	@Override
	public String toString() {
		return "Product [kind=" + kind + ", commentary=" + commentary + "]";
	}
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
