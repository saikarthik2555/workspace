package com._inteface.hot_drinks;

public class Restaurent {
	public HotDrink prepare(HotDrink hd) {		//interface as method parameter
		hd.prepare();
		return new Tea();
	}
	
}
