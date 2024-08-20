package com.sample;

public class Order {
	public static void main(String[] args) {
		Restaurent.createObject(new Tea());
		Restaurent.createObject(new Coffee());
		Restaurent.createObject(new Boost());
		new Tea().prepare();
	}

}
