package com.Has_a_aggregation;

import java.util.Date;

public class Aadhar {
	private long aadharNumber;
	private Date dateOfIssue;
	private String issuingAuthority;
	public Aadhar(long aadharNumber, Date dateOfIssue, String issuingAuthority) {
		super();
		this.aadharNumber = aadharNumber;
		this.dateOfIssue = dateOfIssue;
		this.issuingAuthority = issuingAuthority;
	}
	@Override
	public String toString() {
		return "Aadhar [aadharNumber=" + aadharNumber + ", dateOfIssue=["+dateOfIssue+"] , issuingAuthority=" + issuingAuthority + "]";
	}
	
	

}
