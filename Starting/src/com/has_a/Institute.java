package com.has_a;

public class Institute {
	private int regNo;
	private String name;
	public Institute(int regNo,String name){
		this.regNo=regNo;
		this.name=name;		
	}
	@Override
	public String toString() {
		return "Institute [regNo=" + regNo + ", name=" + name + "]";
	}
	

}
