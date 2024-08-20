package com.credit_points;
import java.lang.Math;
public class Elc {
	public static void main(String[] args) {
		Customer c1=new Customer("Rajeev", 1000);
			CardType card=CardsOnOffer.getOfferedCard(c1);
			System.out.println(card);
			
	}

}
