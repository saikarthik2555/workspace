package com._inteface.hot_drinks;

public class Main {
	public static void main(String[] args) {
		Tea t=(Tea)new Restaurent().prepare(new Tea());		//loose coupleing		down casting
		System.out.println(t.price());
		
//		new Restaurent().prepare(new Coffee());
//		new Restaurent().prepare(new Boost());
//		new Restaurent().prepare(new Horlicks());
//		//if the degree of the dependency of One class Obj to another class is less is called Loose Coupling
//		
//		System.out.println("==============================");
//		
//		new Tea().prepare();
//		new Coffee().prepare();
//		new Boost().prepare();
//		new Horlicks().prepare(); 	
//		//if the degree of dependency of One class to another class is high is called Tightly coupling
		
	}

}
