package com.mcqs;

public class Test12 extends Singer {
	public static String sing() {
		return "Method from sub";
	}
		
	public static void main(String[] args) {
		//System.out.println(Singer.sing());
		Test12 t=new Test12();
		Singer s=new Test12();               
		System.out.println(t.sing());       //priority to sub;
		System.out.println(s.sing());       //static 
	}

}
 class Singer{
	public static String sing() {
		return "Method from super";
		}
}

