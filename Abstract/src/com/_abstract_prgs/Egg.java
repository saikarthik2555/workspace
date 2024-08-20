package com._abstract_prgs;


public class Egg extends Food 
{ 
	int tastyScore;
	String type;
	double protein;
	double facts;
	double carbs;
	public Egg(){
		super(7,"non -vegetrain");
			this.protein=4.0;
			this.facts=1.1;
			this.carbs=13.8;		
	}
	@Override
	public void getMacroNutrients() {
		System.out.println("An egg has "+this.protein+" gms of protein ,"+this.facts+" gms of facts and "+this.carbs);     
	}

}
