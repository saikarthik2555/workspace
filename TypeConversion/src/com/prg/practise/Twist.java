package com.prg.practise;

public class Twist {
	public static void main(String[] args) {
		Beta b=new Beta();
		Beta c=(Beta)(Alpha)b;			//downcasting no error
		System.out.println(c);
		System.out.println(c instanceof Beta);
		
		
//		Beta b1=new Beta();
//		Beta c1=(Alpha)(Beta)b;		//error  i.e last casting must be compatible with destination type
//		System.out.println(c1);
//		System.out.println(c1 instanceof Beta);
		Beta b3=new Beta();
		Alpha c3=(Alpha)b3;			//upcasting
//		Alpha d3=new Alpha();
//		Beta x=(Beta)d3;			//downcasting  exception
		
		Alpha a3=new Alpha();
		System.out.println(a3 instanceof Beta);			//false
	}

}
interface Aoo{
	
}
class Alpha implements Aoo{
	
}
class Beta extends Alpha{
	
}
class Delta extends Beta{
	
}