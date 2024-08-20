package com._inteface.hot_drinks;

public class Coffee implements HotDrink{

	@Override
	public void prepare() {
		System.out.println("Prepareing Coffee");
	}
	
	public int price() {
		return 20;
	}
}
