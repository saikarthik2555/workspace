package com.blank_final;

//blank final variable should be initialize through 
//user by constructor or at the time of declaration...
//default constructor will not initialize with default values
public class Test extends Object{
	public static void main(String[] args) {
		Demo d=new Demo();
		System.out.println(d.ch);
		Demo d1=new Demo('f');
		
		
	}
}

class Demo extends Object{
	final char ch;
	public Demo(){
		ch='m';
		//System.out.println(ch);
	}
//	public void setCh(char ch) {	//by using setter also we cannot modify the final variable
//		this.ch=ch;
//	}
	public Demo(char i) {
		ch=i;
		System.out.println(ch);
	}
}