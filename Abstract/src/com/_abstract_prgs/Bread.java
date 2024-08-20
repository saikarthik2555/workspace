package com._abstract_prgs;

public class Bread extends Food { 
//	int tastyScore;
//	String type;
	double protein;
	double facts;
	double carbs;
	public Bread(){
		super(8,"Vegetrain");
			this.protein=4;
			this.facts=1.1;
			this.carbs=13.8;	
	}
	@Override
	public void getMacroNutrients() {
		System.out.println("A Slice of bread has "+this.protein+" gms of protein ,"+this.facts+" gms of facts and "+this.carbs+" gms of carbohydrates");     
	}

}
