package com.record;

public class Main {
	public static void main(String[] args) {
		WithoutRecord r1=new WithoutRecord(1, "sai", 1234d);
		WithoutRecord r2=new WithoutRecord(1, "sai", 1234d);
		System.out.println(r1.getName());
		System.out.println(r1.equals(r2)+" "+true);
		System.out.println((r1.hashCode()==r2.hashCode())+" "+false);
		System.out.println(r1);
		
	}

}
