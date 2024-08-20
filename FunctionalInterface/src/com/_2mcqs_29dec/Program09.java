package com._2mcqs_29dec;
interface Samplell{
	int x=20;
	public static void m1() {
		System.out.println("m1 fom interface");
	}
}
class Examplell {
	Samplell s;
	public Examplell(Samplell s) {
		this.s=s;		
	}
}
public class Program09 {
	public static void main(String[] args) {
		Samplell s = new Samplell() {
			int x = 30;

//			public static void m1() {					//we cannot write static method inside block
//				System.out.println("m1 from AIC");
//			}
		};
		Examplell e = new Examplell(s);
		System.out.println(e.s.x);
	//	e.s.m1();		//we cannot call static method through object reference
	Samplell.m1(); //calling static method pg inetrface using class name
	}
}

//interface Samplel {
//	int x = 20;
//
//	public static void m1() {
//		System.out.println("m1 from interface");
//	}
//}
//
//class Examplel {
//	Samplel s;
//
//	public Examplel(Samplel s) {
//		super();
//		this.s = s;
//	}
//
//}
//
//public class Program09 {
//	public static void main(String[] args) {
//		Samplel s = new Samplel() {
//			int x = 30;
//
//			Samplel.m1();
//		};
//		Examplel e = new Examplel(s);
//		System.out.println(e.s.x);
//		Samplel.m1();
//	}
//}