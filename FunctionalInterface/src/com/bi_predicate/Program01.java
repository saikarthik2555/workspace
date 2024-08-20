package com.bi_predicate;

//@FunctionalInterface
//interface BiPredicate<String,String>{
//public abstract boolean test(String str,String str);
//}
import java.util.function.BiPredicate;

public class Program01 {
	public static void main(String []args) {
		BiPredicate<String,String> biType=(x,y)-> x.equals(y);
		System.out.println(biType.test("sai","sai"));
	}


}
