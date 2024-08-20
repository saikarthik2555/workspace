package com.Has_a_composition;

public class MotherBoard {
	private String foamFactor;
	private String chipset;
	private String ramType;
	public MotherBoard(String foamFactor, String chipset, String ramType) {
		super();
		this.foamFactor = foamFactor;
		this.chipset = chipset;
		this.ramType = ramType;
	}
	@Override
	public String toString() {
		return "MotherBoard [foamFactor=" + foamFactor + ", chipset=" + chipset + ", ramType=" + ramType + "]";
	}
	
	

}
