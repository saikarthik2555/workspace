package com.hierarchical_level;

public class Developer extends Employee{
	protected int bonus;
	protected Developer(int bonus) {
		this.bonus=bonus;
	}
	@Override
	public String toString() {
		return "Developer [bonus=" + bonus + "]";
	}

	

}
