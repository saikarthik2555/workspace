package com.mcqs;

interface A
{
public void innerMeth();
}
public class Test 
{
  A a;                                    //declaration
  int memVar = 1;
void aMethod()  
	{
   a = new A()                             //anonymous class
		{
	@Override   
   public void innerMeth()
		{
       System.out.println(memVar);
       } 
		};
   }
 public static void main(String[] args)
	  {
           Test t = new Test();
  
		
         t.aMethod();
         t.a.innerMeth();
			 
     }
     }