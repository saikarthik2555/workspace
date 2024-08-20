package com.senario_6feb;

public class OnlineShoppingApp {
	Product p1=new Product(12, "Hp", " intel core i5 11th Gen", 30000);
	Product p2=new Product(14, "Redmi note 13 pro", " Qualcomm SM7435 Andrioid 13 8/256 gb", 24000);
	Product p[]=new Product[] {p1,p2};
	ShoppingCart s=new ShoppingCart(p);
	
	Customer c1=new Customer("Smith",s){
		public void run() {
			
		}
	};
	
	
	
}
