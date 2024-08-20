package com.practise;
class Come{
	public static void getNumber(int num) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		System.out.println("........................");
	}
}
public class Tables {
	protected  String name="karthik";
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			Come.getNumber(i);
		}
	}
}
