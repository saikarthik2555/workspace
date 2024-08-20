package com.mcqs;

import java.util.function.Predicate;

public class Program07 {
	public static void main(String[] args) {
		String str[]= {"java","python","ameerpet","lava"};   //array
		Predicate<String> predi=p -> p.endsWith("va");		
		for(String si:str) {								//for each
			if(predi.test(si)) {							//
				System.out.println(si);			
			}
		}
	}
}
