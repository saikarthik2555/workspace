package com.taskques_2mar;

import java.util.ArrayList;
import java.util.List;

public class FirstCharUpper {
	public static void main(String[] args) {
		String str="java";
		System.out.println(str.substring(1,str.length()));
		List<String> ls=new ArrayList<String>();
		ls.add("sunday");
		ls.add("Monday");
		ls.add("tuesday");
		ls.add("wednesday");
		ls.add("thursday");
		ls.stream().map(s-> s.substring(0,1).toUpperCase()+s.substring(1,s.length())).forEach(System.out::println);
		
	}
}