package com.bi_function;

import java.util.function.BiFunction;


public class Program01 {
	public static void main(String[] args) {
	BiFunction<Integer,Integer,Character> bifnType=(x,y)-> (char)(x+y);   //at return statement
	System.out.println(bifnType.apply(67, 32));

//	BiFunction<Character,Character,Character> bifnType1=(x,y)-> char(x+y);
//	System.out.println(bifnType.apply(52, 52));
	}
}
