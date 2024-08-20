package com.bi_consumer;
import java.util.function.BiConsumer;

public class Program01 {
	public static void main(String[] args) {
		BiConsumer<Integer,String> biCon=(num,str)-> {
			num=num*2;
			str=str.toUpperCase();
			System.out.print(num+" "+str);
		};
		biCon.accept(7,"sai");
		char a='A';
		char b='B';
		System.out.println(a+b);
		
	}

}
