package com.stream_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		List<String> lst=new ArrayList<>();
		lst.add("One");
		lst.add("Two");
		lst.add("Three");
		lst.add("Four");
		Stream<String> s=lst.stream();
		lst.forEach(t-> System.out.println(t));
	}

}
