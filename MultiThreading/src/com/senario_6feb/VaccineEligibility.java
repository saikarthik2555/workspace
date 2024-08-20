package com.senario_6feb;

public class VaccineEligibility{
	private int age;
	private boolean hasHealthCondition;
	public VaccineEligibility(int age,boolean hasHealthCondition) {  
		this.age=age;
		this.hasHealthCondition=hasHealthCondition;
	}
	
	
	public boolean isEligible() {	//non-static
		if(this.age>=18 && age<=60 && this.hasHealthCondition) {
		return true;
		} return false;
		
	}
}
