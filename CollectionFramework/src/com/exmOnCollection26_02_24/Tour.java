package com.exmOnCollection26_02_24;

import java.util.List;

public class Tour {
	int tourCode=100;
	String tourName;
	List<String> destination;
	String tourGuide;
	String contactNumber;
	String location;
	public Tour(String tourName, List<String> destination, String tourGuide, String contactNumber, String location) {
		super();
		this.tourName = tourName;
		this.destination = destination;
		this.tourGuide = tourGuide;
		this.contactNumber = contactNumber;
		this.location = location;
	}
	public String getTourName() {
		return tourName;
	}
	public void setTourName(String tourName) {
		this.tourName = tourName;
	}
	public List<String> getDestination() {
		return destination;
	}
	public void setDestination(List<String> destination) {
		this.destination = destination;
	}
	public String getTourGuide() {
		return tourGuide;
	}
	public void setTourGuide(String tourGuide) {
		this.tourGuide = tourGuide;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Tour [tourCode ="+ tourCode+", tourName=" + tourName + ", destination=" + destination + ", tourGuide=" + tourGuide
				+ ", contactNumber=" + contactNumber + ", location=" + location + "]";
	}
}



