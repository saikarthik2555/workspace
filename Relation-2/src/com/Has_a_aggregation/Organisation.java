package com.Has_a_aggregation;

public class Organisation {
	private int orgId;
	private String orgName;
	private String orgAddress;
	public Organisation(int orgId, String orgName, String orgAddress) {
		super();
		this.orgId = orgId;
		this.orgName = orgName;
		this.orgAddress = orgAddress;
	}
	@Override
	public String toString() {
		return "Organisation [orgId=" + orgId + ", orgName=" + orgName + ", orgAddress=" + orgAddress + "]";
	}
	
	

}
