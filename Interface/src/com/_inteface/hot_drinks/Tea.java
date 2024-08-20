package com._inteface.hot_drinks;

public class Tea implements HotDrink{

	@Override
	public void prepare() {
		System.out.println("Preparing Tea");
	}
	
	public int price() {
		return 10;
	}

}
