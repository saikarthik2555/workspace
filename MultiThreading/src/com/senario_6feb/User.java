package com.senario_6feb;

public class User {
	private String name;
	private VaccineEligibility eligibility;
	private DoseBooking doseBooking;
	public User(String name,int age, boolean hasHealthCondition) {
		this.name=name;
		this.eligibility=new VaccineEligibility(age, hasHealthCondition);
		this.doseBooking=new DoseBooking(false);
	}
	
	public boolean isEligible() {
		
		return this.eligibility.isEligible();
	}
	public boolean doseBooked() {
	if(this.eligibility.isEligible()) {
		return (this.doseBooking.doseBooked());
	}
	return false;
	}
	
	public boolean isDoseBooked() {
		return (!this.doseBooking.isDoseBooked());
	}
	
}
