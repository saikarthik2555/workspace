package com.record_mcqs;


record Add1(int a,int b) {		
	Add1(int a){				//A non-canonical constructor must start with a constructor
		this(1,4);
	}

}
public class Program2 {
	public static void main(String[] args) {
	//Add1 a=new Add1();
	Add1 b=new Add1(1);
	
		}
}
