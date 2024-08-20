package com.practise;

public class CardsOnOffer {
	
	public static CardType getOfferedCard(Customerr c) {
		if(c.getCreditPoints()<500){
			return new CardType(c, "silver");
		}
		else if(c.getCreditPoints()>=501 && c.getCreditPoints()<1000)
		return new CardType(c, "Gold");
		else if(c.getCreditPoints()<100) {
			return new CardType(c, "EMI");
		}
		else {
			return new CardType(c, "Platinum");
		}
	}
}
