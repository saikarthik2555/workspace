package com.wexm22_01_24;

public class CreditCard {
	static int creditCard=1000;
	public static void main(String[] args) {

		CreditCard c=new CreditCard();
		c.makePurchase(500);
		c.makePayment(200);
		c.makePayment(400);

	}
			public void makePurchase(int purchase) {
				try {
				 creditCard =creditCard- purchase;
				 System.out.println("$"+purchase+"  Purchase made Successfully");
			}catch(Exception e) {
				System.out.println("Purchase Amount exceeds the balance ");
			}
			}
			public void makePayment(int payment) {
				try {
						creditCard =creditCard- payment;  
						if(creditCard>=0) {
					}else {
//						System.out.println("balance :"+creditCard);
					throw new IllegalArgumentException();
					}
				
				 System.out.println("$"+payment+"  Payment made Successfully");				
			}catch(Exception e) {
				System.out.println("Payment Amount exceeds the balance");
			}
			}
						
}
