package com.prg.local_method_innerclass;

class MyOuter3
{
      private String x = "Outer class Data";

      public void doSttuff()
      { 
           String z = "local variable";  
            class MyInner        
            {
	//String z = "CLASS variable"; 
                 public void seeOuter()
                 {
                      System.out.println("Outer x is "+x);
                      System.out.println("Local variable z is : "+z);
                 }
           }
            new MyInner().seeOuter();
	  }
//		   MyInner mi = new MyInner();			//scope is up to Method level
//	        mi.seeOuter(); 
		      
      
	     	
	  
}
public class Test12
{
      public static void main(String args[])
      {
            MyOuter3 m = new MyOuter3();
            m.doSttuff();  
      } 
}
