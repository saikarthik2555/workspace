package com.mcqs;
import java.util.function.Predicate;
public class Program08 {
	public static void main(String[] args) {
		String str[]= {"java","lava"};
		Predicate<String> predi= new   Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.endsWith("va");
			}
		};
		for(String si: str) {
			if(predi.test(si)) {
				System.out.println(si);
			}
		}
		
	}

}
