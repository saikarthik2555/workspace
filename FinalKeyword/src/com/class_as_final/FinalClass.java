package com.class_as_final;

public final class FinalClass {
	private int a=12;
	private String name="Sai";
	
	public void setData() {
		System.out.println(" Im from final class");
	}
	public void setName(String name) {		//setter
		this.name=name;
	}
	public void setA(int a) {			//setter
		this.a=a;
	}
	public int getA() {
		return a;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		FinalClass f=new FinalClass();
		System.out.println(f.getName());
		System.out.println(f.getA());
		f.setA(19);
		f.setName("Karthik");
		System.out.println(f.getName());
		System.out.println(f.getA());
		f.setData();
		
	}
	
	
}
