package com.comparable;

public class Product1 implements Comparable<Product1> {
	private Integer pid;
	private String name;
	private Double price;
	public Product1(Integer pid, String name, Double price) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	
	public Integer getPid() {
		return pid;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	@Override
	public int compareTo(Product1 p1) {
		
		return this.name.compareTo(p1.name);		//sorting based on name
	}
	
	@Override
	public String toString() {
		return "Product1 [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}


}
