package com.practise;

public abstract class Has_A {
	public static void main(String[] args) {
		main(12.0f);
		main("sai");
		Company c1=new Company("TCS", "Gachibowli");
		System.out.println(c1);
	}
	public static void main(String args) {
		Company c1=new Company("TCS", "Gachibowli");
		System.out.println(c1);
	}
	public static void main(Float args) {
		Company c1=new Company("TCS", "Gachibowli");
		System.out.println(c1);
	}

}
