package com.credit_points;

public class Customer {
	private String customerName;
	private int creditPoints;
	public Customer(String customerName, int creditPoints) {
		super();
		this.customerName = customerName;
		this.creditPoints = creditPoints;
	}
	public int getCreditPoints() {
		return this.creditPoints;
	}
	@Override
	public String toString() {
		return "Customer " + customerName + "";
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCreditPoints(int creditPoints) {
		this.creditPoints = creditPoints;
	}
	
	

}
