package com.exmOnCollection26_02_24;

public class Mobile implements Comparable<Mobile>{
	private Integer mobileNo;
	private String mobileName;
	private Double mobilePrice;
	public Mobile(Integer mobileNo, String mobileName, Double mobilePrice) {
		super();
		this.mobileNo = mobileNo;
		this.mobileName = mobileName;
		this.mobilePrice = mobilePrice;
	}
	public Integer getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public Double getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(Double mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	@Override
	public String toString() {
		return "Mobile [mobileNo=" + mobileNo + ", mobileName=" + mobileName + ", mobilePrice=" + mobilePrice + "]";
	}
	@Override
	public int compareTo(Mobile m) {
		
		return this.getMobileNo()-m.getMobileNo();
	}
	
}
