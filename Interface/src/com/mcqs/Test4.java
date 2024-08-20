package com.mcqs;

interface ITest
{
     public void setVal();
}
public class Test4  
	  {
    private String a;
    void aMethod()
		  {
    final String b="World";
    ITest it = new ITest() 
		   {
         public void setVal()
		   {
         a = "Hello";               
         }
		   };
    it.setVal();
    
    System.out.println(a + b);
    }
    
    public static void main(String[] args)
    {
    Test4 t = new Test4();
    t.aMethod();
    }
 }