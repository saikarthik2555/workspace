package com.comparable;

public class Product2 implements Comparable<Product2> {
	private Integer pid;
	private String name;
	private Double price;
	public Product2(Integer pid, String name, Double price) {
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
	public int compareTo(Product2 p1) {
		
		return this.getPid().compareTo(p1.getPid());		//sorting based on Id
	}
	@Override
	public String toString() {
		return "Product2 [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}
	

}
