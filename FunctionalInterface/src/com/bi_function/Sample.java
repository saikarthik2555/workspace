package com.bi_function;

import java.util.function.BiFunction;

public class Sample {
	public static void main(String[] args) {
		BiFunction<String,String,Integer> bi=(str,strn)-> str.length()+strn.length();
		System.out.println(bi.apply("sai", "karthik"));
		
		BiFunction<String,Integer,Boolean> gmail=(str,i)-> (i+str).contains("2555");
		System.out.println(gmail.apply("saikarthik", 2555));
	}

}
