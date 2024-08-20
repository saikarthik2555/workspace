package com.mcqs;

interface NIT{
	public abstract String get(String s);
}
public class program05 {
	public static void main(String[] args) {
		NIT m=s -> s+"Hello ";
		NIT m1=s -> s+" Naresh";
		information("Welcome ", m);
		information("Hai",m1);
		
	}
	public static void information(String str, NIT obj) {
		String result=obj.get(str);
		System.out.println(result);
	}

}
