package com.mcqs._26_dec;

public class Program01 {
	public void accept(char... x) {
		System.out.println("Im from char");
	}
	public void accept(int... x) {
		System.out.println("Im from String");
	}
	public static void main(String[] args) {
		Program01 p=new Program01();
		p.accept();
	}

}
