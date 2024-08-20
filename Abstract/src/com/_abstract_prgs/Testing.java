package com._abstract_prgs;

public class Testing {
	public static void main(String[] args) {
		Food bread=new Bread();
		System.out.println(bread.type);          //getType
		bread.getMacroNutrients();              //getMacros
		System.out.println(bread.tastyScore);    //getTaste
		
		Food egg=new Egg();
		System.out.println(egg.type);          //getType
	    egg.getMacroNutrients();              //getMacros
		System.out.println(egg.tastyScore);    //getTaste
	}

}
