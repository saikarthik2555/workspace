package com.tree_set;



public class Mobile{
	private String name;
	private Integer ram;
	private String color;
	private Double price;
	public Mobile(String name, Integer ram, String color, Double price) {
		super();
		this.name = name;
		this.ram = ram;
		this.color = color;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", ram=" + ram + ", color=" + color + ", price=" + price + "]";
	}
//	@Override
//	public int compare(Mobile m1, Mobile m2) {
//		
//		return m1.getRam()-m2.getRam();
//	}

	
}
