package com.credit_points;

public class CardType {
	private Customer customer;		//has a relation
	private String cardType;
	public CardType(Customer customer, String cardType) {
		super();
		this.customer = customer;
		this.cardType = cardType;
	}
	@Override
	public String toString() {
		return "[ " + customer + " is Eligible for " + cardType + " cardType ]";
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	
	

}
