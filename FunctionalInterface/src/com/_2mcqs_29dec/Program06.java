package com._2mcqs_29dec;

@FunctionalInterface
interface Adorable {
	int level  = 10;
	void smile();
}
@FunctionalInterface
interface Lovable extends Adorable{
	int level = 20;
}
public class Program06 {
	public static void main(String[] args) {
		//Adorable a;
		//anonymous block
		Adorable a = new Lovable() {
			@Override
			public void smile() {
				//a = () ->    //no need-->error 
				System.out.println("Smile you are cute.");
			}
		};
		a.smile();
	}
}

