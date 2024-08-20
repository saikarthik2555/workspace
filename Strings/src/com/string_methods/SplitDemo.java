package com.string_methods;

public class SplitDemo {
	//public String[] split(String Delimeter);
	public static void main(String[] args) {
		String name="My batch is batch 26";
		String words[]=name.split("c");
		for(String w:words) {
			System.out.print(w);
		}
		System.out.println("\n"+name.replace('c', ' '));
	}

}
