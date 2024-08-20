package com.record_mcqs;

import java.util.Objects;

record Facultyy(String name,String course) {
	public Facultyy{
		//Objects.requireNonNull(name);
		Objects.requireNonNull(course);
	}
}

//Optional Optional.ofNullable-->  Objects.requireNonNull
//like in Optional 
public class Interesting {
	public static void main(String[] args) {
		Facultyy f=new Facultyy(null,"Java");
		System.out.println(f);
	}
}
