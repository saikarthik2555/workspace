package com.senarioprg_feb14;

public class CabCustomer {
	private int custId;
	private String customerName;
	private String pickUpLocation;
	private String dropLocation;
	private int distance;
	private String phone;
	public CabCustomer() {
		
	}
	public CabCustomer(int custId, String customerName, String pickUpLocation, String dropLocation, int distance,
			String phone) {
		super();
		this.custId = custId;
		this.customerName = customerName;
		this.pickUpLocation = pickUpLocation;
		this.dropLocation = dropLocation;
		this.distance = distance;
		this.phone = phone;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPuckUpLocation() {
		return pickUpLocation;
	}
	public void setPuckUpLocation(String puckUpLocation) {
		this.pickUpLocation = puckUpLocation;
	}
	public String getDropLocation() {
		return dropLocation;
	}
	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "CabCustomer [custId=" + custId + ", customerName=" + customerName + ", pickUpLocation=" + pickUpLocation
				+ ", dropLocation=" + dropLocation + ", distance=" + distance + ", phone=" + phone + "]";
	}
	

}
