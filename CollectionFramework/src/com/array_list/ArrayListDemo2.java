package com.array_list;

import java.util.List;
import java.util.ArrayList;
public class ArrayListDemo2 {
	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("first");
		l.add(0,"second");
		l.add("third");
		l.forEach(t -> System.out.println(t));
		
	}

}
