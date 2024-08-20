package com.prg.sealed_interface;

public class Client {
public static void main(String[] args) {
	Realestate r=new Realestate();
	r.price();
	r.area();
	System.out.println("-------------------");
	Land w=new Websites();
	w.price();
	w.area();
	
}
}
