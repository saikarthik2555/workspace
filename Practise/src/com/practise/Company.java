package com.practise;

public class Company {
	private String cpyName;
	private String cpyLoc;
	
	public Company(String cpyName,String cpyLoc) {
		this.cpyName=cpyName;
		this.cpyLoc=cpyLoc;
	}
	
	public String getCpyName() {
		return cpyName;
	}

	public void setCpyName(String cpyName) {
		this.cpyName = cpyName;
	}

	public String getCpyLoc() {
		return cpyLoc;
	}

	public void setCpyLoc(String cpyLoc) {
		this.cpyLoc = cpyLoc;
	}

	@Override
	public String toString() {
		return "Company [cpyName=" + cpyName + ", cpyLoc=" + cpyLoc + "]";
	}
	
	
	
}
