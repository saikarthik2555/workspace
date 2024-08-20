package com.july.practise.hierarchical;

public class Ambiguity {
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.getData(34);   				//calling widening
		Integer i=Integer.valueOf(34);		//calling autoboxing
		t.getData(i);
	}
}
class Test1{
	public void getData(int a) {
		System.out.println("printing");
	}
	
	public void getData(Integer a) {
		System.out.println("not printing");
		
	}
}
