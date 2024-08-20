package com.practise;

public class ObjectVarargs {
	public void show(Object ...o) {
		for(Object i:o) {
			System.out.println(i	);
		}
	}
	public static void main(String[] args) {
		ObjectVarargs args1=new ObjectVarargs();
		args1.show(12,34,"Hello",'a','d');
		
	}

}
