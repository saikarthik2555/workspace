package com.senario_6feb;

public class Product {
	private int pdtId;
	private String name;
	private String description;
	private double price;
	public Product(int pdtId,String name,String description , double price) {
		this.pdtId=pdtId;
		this.name=name;
		this.description=description;
		this.price=price;
	}
	public int getPdtId() {
		return pdtId;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Product [pdtId=" + pdtId + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}
	

}
