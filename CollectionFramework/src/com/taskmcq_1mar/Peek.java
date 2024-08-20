package com.taskmcq_1mar;

import java.util.ArrayList;
import java.util.List;

public class Peek {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("A");
		al.add("BC");
		al.add("DEF");
		al.add("EFGH");
		al.add("XYZ");
		al.add("GHIJ");
		//peek(Consumer)--> to fetch
		List<String> l=al.stream().filter(num -> num.length()>=2).peek(x -> {}).toList();
		System.out.println(l);
	}

}

