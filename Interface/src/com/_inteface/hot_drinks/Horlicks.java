package com._inteface.hot_drinks;

public class Horlicks implements HotDrink{

	@Override
	public void prepare() {
		System.out.println("Preparing Horlicks");
	}

	public int price() {
		return 20;
	}
}
