package com.rules;

import java.io.FileNotFoundException;

public class SuperClassThrows {
	public static void main(String[] args) throws Exception {
		//Should be parent exception
		Supeer s=new Suub();
		s.show1();
	}

}
class Supeer{
	public void show1() throws Exception{	
		//should be parent
		System.out.println("Super class method ");
	}
}
class Suub extends Supeer{
	public void show1() throws FileNotFoundException{
		//should be sub or same exception
		System.out.println("Sub class method");
	}
}