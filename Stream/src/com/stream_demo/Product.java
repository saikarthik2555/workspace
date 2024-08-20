package com.stream_demo;

import java.util.List;

public class Product {
	private Integer id;
	private List<String> listOfProducts;
	public Product (Integer id,List<String> listOfProducts) {
		this.id=id;
		this.listOfProducts=listOfProducts;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<String> getListOfProducts() {
		return listOfProducts;
	}
	public void setListOfProducts(List<String> listOfProducts) {
		this.listOfProducts = listOfProducts;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", listOfProducts=" + listOfProducts + "]";
	}
	
	
	

}
