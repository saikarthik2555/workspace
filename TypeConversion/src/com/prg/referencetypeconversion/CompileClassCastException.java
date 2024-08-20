package com.prg.referencetypeconversion;

public class CompileClassCastException {
	public static void main(String[] args) {
	  Object obj=new Parent();
	  System.out.println(obj instanceof Child);
	  Child c=(Child)obj; //here compiler check only source variable type i.e obj and cast type 
	 
	  //ClassCastException  to slove we use instanceof operator
	  
	  
	 Sibbling s= new Sibbling();
	Object obj1=(Object)s;
		
		
		
		
	}
}

