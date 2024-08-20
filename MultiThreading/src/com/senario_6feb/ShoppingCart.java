package com.senario_6feb;

import java.util.Arrays;

public class ShoppingCart {
	private Product cartItems[];		//has a relation
	private int itemCount;
	private static final int MAX_CAPACITY=10;
	public ShoppingCart(Product cartItems[]) {		//constructor
		this.cartItems=cartItems;
		this.itemCount=this.cartItems.length;
	}
	
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	public Product[] getCartItems() {
		return cartItems;
	}
	public void setCartItems(Product[] cartItems) {
		this.cartItems = cartItems;
	}
	public void addItem(Product product) {
		
		if(itemCount>MAX_CAPACITY) {
			System.out.println("Cart is full cannot add more items");
		}
	}
	public String displayCartItems() {
		return cartItems.toString()+"ShoppingCart [cardItems=" + Arrays.toString(cartItems) + ", itemCount=" + itemCount + "]";
	}
		
	public void clearCart() {
		itemCount=0;
	}
	
	
}
