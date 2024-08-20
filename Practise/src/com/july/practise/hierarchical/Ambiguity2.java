package com.july.practise.hierarchical;

public class Ambiguity2{
	public static void main(String[] args) {
		//new Test2().getData(null);
	}
}

class Test2{
	public void getData(String b) {
		System.out.println("String");
	}
	public void getData(Integer a) {
		System.out.println("Integer");
	}
	
}