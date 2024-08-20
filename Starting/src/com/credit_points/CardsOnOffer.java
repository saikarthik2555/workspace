package com.credit_points;

public class CardsOnOffer {
	public static CardType getOfferedCard(Customer c) {		//copy constructor
		if(c.getCreditPoints()>100 && c.getCreditPoints()<500) {
			return new CardType(c, "Silver");
		}
		else if(c.getCreditPoints() > 501 && c.getCreditPoints() < 1000) {
			return new CardType(c, "Gold");
		}
		else if(c.getCreditPoints() >= 1000) {
			return new CardType(c,"Platinum");
		}
		else {
			return new CardType(c,"EMI");
		}
	}

}
