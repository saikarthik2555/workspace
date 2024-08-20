package com.taskques_2mar;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
	public static void main(String[] args) {
		List<String> ls=new ArrayList<String>();
		ls.add("sunday");
		ls.add("Monday");
		ls.add("tuesday");
		ls.add("wednesday");
		ls.add("thursday");
//		ls.stream().forEach(str ->System.out.println(str.toUpperCase()));
		ls.stream().filter(str -> {
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)<=97 && str.charAt(i)<=122) {
					return true;
				}
			}
		}).forEach(str -> {
			for(int i=0;i<str.length();i++) {
				System.out.println(str.charAt(i)-=32);
			}
		});
	}

}
