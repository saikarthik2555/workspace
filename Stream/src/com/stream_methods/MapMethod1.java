package com.stream_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMethod1 {
	public static void main(String[] args) {
		List<String> l=Arrays.asList("Jaguar","Aston Martin","VolksWagan","Audi");
		List<Character> java=l.stream().flatMap(name-> Stream.of(name.charAt(0))).collect(Collectors.toList());
				System.out.println(java);				
	}

}
