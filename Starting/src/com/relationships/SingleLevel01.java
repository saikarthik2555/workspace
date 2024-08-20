package com.relationships;

public class SingleLevel01 {
	public static void main(String[] args) {
		Temp t=new Temp(1, "Smith", "Ameerpet");
		Pemp p=new Pemp(2, "Smith", "Ameerpet", "Java", "Developer");
		System.out.println(p);
	}

}
