package com.practise;

public class CardType {
private Customerr cust;		
private String cardType;
public CardType(Customerr cust, String cardType) {
	super();
	this.cust = cust;
	this.cardType = cardType;
}
@Override
public String toString() {
	return "CardType [cust=" + cust.getCustomerName() + ", cardType=" + cardType + "]";
}

}
