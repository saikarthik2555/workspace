package com.practise;

public class Organisation {
	private String orgName;
	private String orgLocation;
	public Organisation(String orgName,String orgLocation)
	{
		this.orgName=orgName;
		this.orgLocation=orgLocation;
	}
	
	
	public String getOrgName() {
		return orgName;
	}


	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}


	public String getOrgLocation() {
		return orgLocation;
	}


	public void setOrgLocation(String orgLocation) {
		this.orgLocation = orgLocation;
	}


	@Override
	public String toString() {
		return "[Organisation Name "+orgName+" Organisation Location "+orgLocation+"]";
	}


}
