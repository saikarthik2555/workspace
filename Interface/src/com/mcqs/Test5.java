package com.mcqs;

interface ITestt
	{
    public void setVal();
   }
   public class Test5 
	 {
     private String a;
     void aMethod()
	 {
     final String b = " World";
     ITestt it = new ITestt() {
                  public void setVal(){
                  a = "Hello" + b;
                  }};
     it.setVal();
     System.out.println(a);
     }
     public static void main(String[] args) {
     Test5 t = new Test5();
     t.aMethod();
     }
   }