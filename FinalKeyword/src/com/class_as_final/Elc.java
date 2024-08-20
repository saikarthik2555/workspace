package com.class_as_final;

public class Elc {				// extends FinalClass 	is a relation  not possible exists
	public static void main(String[] args) {
		FinalClass f=new FinalClass();
		System.out.println(f.getName());
		f.setName("ajuvin");
		f.setData();
		Integer i=new Integer(12);
		System.out.println(i.MAX_VALUE);		//variable as final...can access but not re-assign
	}
}
