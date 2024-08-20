package com.july.practise.hierarchical;

import com.practise.Staticvariables;

public class ModiiersStaticVariables extends Staticvariables{
	public static void main(String[] args) {
	System.out.println("public "+Staticvariables.name4);
		
		System.out.println("protected  extends : "+ModiiersStaticVariables.name2);
		
	
		System.out.println("default : static getter :"+Staticvariables.getName3());
		
		
		System.out.println("Private static getter: "+Staticvariables.getName1());
		
	}

}
