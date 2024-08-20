package com.exmOnCollection26_02_24;

public class Car implements Comparable<Car>{
	private Integer carNumber;
	private String carName;
	private Double carPrice;
	public Car(Integer carNumber, String carName, Double carPrice) {
		super();
		this.carNumber = carNumber;
		this.carName = carName;
		this.carPrice = carPrice;
	}
	public Integer getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(Integer carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(Double carPrice) {
		this.carPrice = carPrice;
	}
	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", carName=" + carName + ", carPrice=" + carPrice + "]";
	}
	@Override
	public int compareTo(Car c) {
		
		return this.getCarName().compareTo(c.getCarName());
	}
	

}
