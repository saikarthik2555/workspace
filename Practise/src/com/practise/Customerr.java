package com.practise;

public class Customerr {
	private String customerName;
	private int creditPoints;
	public Customerr(String customerName,int creditPoints) {
		this.customerName=customerName;
		this.creditPoints=creditPoints;
	}
	public int getCreditPoints(){
		return creditPoints;
	}
	@Override
	public String toString() {
		return "Customerr [customerName=" + customerName + "]";
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
