package com.var_args;

public class Test {
	
	public void getData(String ...x) {
		System.out.println("Hello");
		for(String i:x) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Test t1=new Test();
		t1.getData();
		t1.getData("12,34,45");
		t1.getData("234","34");
	}

}
