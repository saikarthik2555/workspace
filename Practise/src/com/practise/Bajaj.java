package com.practise;

public class Bajaj {
	public static void main(String[] args) {
		Customerr c=new Customerr("Rajeev", 1002);
		CardType type=CardsOnOffer.getOfferedCard(c);
		System.out.println(type);
	}
}
