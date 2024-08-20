package com.hierarchical_level;

public class Designer extends Employee{
	protected double bonus;
	public Designer(double bonus) {
		this.bonus=bonus;
	}

	@Override
	public String toString() {
		return "Designer [salary=" + salary + "]";
	}

	
	

}
