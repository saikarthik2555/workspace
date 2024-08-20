package com.method_as_final;

class A extends Object
{
	protected int a = 10;
	protected int b = 20;

     public  void calculate()
	  {
		int sum = a+b;
		System.out.println("Sum is :"+sum);
	  } 
}
class B extends A 
{	
	@Override
	public final void calculate() 			//we can declare sub class method as final
											//when no need to extends/inherit this class
	{
		int mul = a*b;
		System.out.println("Mul is :"+mul);	
	}
}
class C extends B{			//error because we are extending class B and using/overriding final method
//	@Override
//	public void calculate() {
//		
//	}
}
public class FinalMethod 
{
	public static void main(String [] args) 
	{
		 A a1 = new B();
		 a1.calculate();
		 B b=new C();
		 b.calculate();		//not present in C
	}
}