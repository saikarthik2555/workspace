package com.practise;

public class FinalVar {
	public FinalVar() {		//user defined constructor
		this.A=45;
	}
	public FinalVar(int b) {
		this.A = 0;
	}
	final int A;
	public static void main(String[] args) {
	FinalVar f=new FinalVar();	
	FinalVar f1=new FinalVar(12);	
	System.out.println(f.A);
	}
}
