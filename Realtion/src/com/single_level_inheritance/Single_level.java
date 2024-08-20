package com.single_level_inheritance;

public class Single_level {
	public static void main(String[] args) {
		Par_emp p=new Par_emp(123, "Smith", "Australia", 2, "Manager");
		System.out.println(p);
		
		Tem_emp t=new Tem_emp(34, "Ford", "russia");
		System.out.println(t);
		p.getData();
	}

}
