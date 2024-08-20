package com._inteface.hot_drinks;

public class Boost implements HotDrink{

	@Override
	public void prepare() {
		System.out.println("Prepraing Boost");
	}
	
	public int price() {
		return 25;
	}
}
