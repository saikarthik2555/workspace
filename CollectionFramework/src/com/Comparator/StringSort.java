package com.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringSort{
	public static void main(String[] args) {
		List<String> lst=new ArrayList<>();
		lst.add("wednesday");
		lst.add("monday");
		lst.add("tuesday");
		lst.add("sunday");
		lst.add("saturday");
		lst.add("thursday");
		Comparator<String> cp=new Comparator<>() {
			@Override
			public int compare(String str1, String str2) {
				
				return str1.compareTo(str2);
			}
		};
		lst.sort(cp);
		System.out.println(lst);
		
		for(char i=97;i<=122;++i) {
			System.out.print(i+" "+(int)i+" \n");
		}
	}

	
}
