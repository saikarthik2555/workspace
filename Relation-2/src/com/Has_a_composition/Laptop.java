package com.Has_a_composition;

public class Laptop {
	private String Operatingtype;
	private String laptopName;
	private String processortype;
	private MotherBoard motherboard;
	public Laptop(String operatingtype, String laptopName, String processortype) {
		super();
		Operatingtype = operatingtype;
		this.laptopName = laptopName;
		this.processortype = processortype;
		this.motherboard = new MotherBoard("Standard ATX,", "AMD", "DDR4");  //composition
	}
	@Override
	public String toString() {
		return "Laptop [Operatingtype=" + Operatingtype + ", laptopName=" + laptopName + ", processortype="
				+ processortype + ", motherboard=" + motherboard + "]";
	}
	
	
	
	
	

}
