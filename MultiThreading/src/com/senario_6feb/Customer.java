package com.senario_6feb;

public class Customer extends Thread{
	private String name;
	private ShoppingCart cart;
	public Customer(String name,ShoppingCart cart) {
		this.name=name;
		
	}
	public String viewCart() {
		return cart.displayCartItems();
	}
	public void placeOrder() {
		
		Product p[]=cart.getCartItems();
		int totprice =0;
		for(int i=0;i<cart.getItemCount();i++)
		{
			totprice+=p[i].getPrice();
			
		}
		System.out.println("order placed");
		
		cart.clearCart();
	}
}
