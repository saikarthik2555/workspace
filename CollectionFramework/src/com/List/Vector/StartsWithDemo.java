package com.List.Vector;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StartsWithDemo {
	public static void main(String[] args) {
		List<String> lst=Arrays.asList("Rahul","Rohit","Scott","Smith","Miller");
		Vector<String> v=new Vector<>(lst);
		v.forEach(str -> System.out.println(str.startsWith("R")));
	
	}
}
