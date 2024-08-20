package com._abstract_prgs;

abstract class Food{
	String type;
	double protein;
	double facts;
	double carbs;
	double tastyScore;
	public Food(double tastyScore,String type) {
		this.type=type;
		this.tastyScore=tastyScore;
	}
	
	public abstract void getMacroNutrients();
}