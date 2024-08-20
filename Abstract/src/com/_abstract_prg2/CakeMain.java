package com._abstract_prg2;

public class CakeMain {

	public static void main(String[] args) {
		Cake c=new OrderedCake("Round", "Vanilla", 5, "Happy Birthday");
		c.showCake();
		Cake c1=new OrderedCake("square", "butterscoth", 3);
		c1.showCake();
	}

}
