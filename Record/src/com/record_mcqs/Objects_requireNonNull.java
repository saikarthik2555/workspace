package com.record_mcqs;

import java.util.Objects;

record  Test(Integer id,String name) {			//cononical constructor
	public Test {								//Class
		//Objects.requireNonNull(id);
		Objects.requireNonNull(name);	
	}
}
//If we are Using Objects.requireNonNull  --> then it wont allow null
public class Objects_requireNonNull {
	public static void main(String[] args) {
		Test t=new Test(null,"Str");
		System.out.println(t);
	}
}
