package com.prg.static_innerclass;

class BigOuter
{
      class Nest   //static nested inner class   
     {
    	  public static void go()  //Instance method of static inner class
          {
               System.out.println("Hello welcome to static nested class");  
          }  
    	  
    	  public void get() {
    		  System.out.println("Non-static o static inner class");
    	  }
     }
}
public class Test
{    
      public static void main(String args[])
      {
         BigOuter.Nest n= new BigOuter().new Nest();
         n.get();
         n.go();
      } 
}
