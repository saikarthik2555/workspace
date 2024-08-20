package com._2mcqs_29dec;
interface Invisiblee{
public abstract void show();
}
class Displayy implements Invisiblee{
	Invisiblee inv;
	public void show() {
		inv=() ->System.out.println("Am i visible ");
	}
	//anonymous block
//	Invisiblee inv=new Invisiblee() {		
//		public void show() {
//			System.out.println("am i visible");
//		}
//	};		//generally in main method we use like inv.show();
			//but here it is present in another class. 
	
	
//	public void show() {
//		System.out.println("Im from Display");
//	} 
}
public class Program03{
	public static void main(String[] args) {
		//new Displayy().inv.show();		//first call show method
		Displayy d=new Displayy();
		d.show();
		d.inv.show();
		System.out.println(d.inv);
	}
}
