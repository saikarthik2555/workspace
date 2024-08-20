package com.stream_methods;

import java.util.List;
import java.util.stream.Stream;

public class Peek {
	public static void main(String[] args) {
		//peek will not change original Stream elements
		Stream<String> days=Stream.of("monday","tuesday","wednesday","thursday","friday");
		List<String> pek=days.peek(str-> System.out.println(str.toUpperCase())).toList();
		pek.forEach(t-> System.out.print(t));
	}

}
