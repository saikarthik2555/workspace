package com.stream_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TakeWhile {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,3,8,5,6);
		l.stream().takeWhile(num-> num<7).forEach(t-> System.out.print(t+" "));
		
		Stream<String> s=Stream.of("sunday","sunday","tuesday","swednesday");
		//takeWhile
		s.takeWhile(str-> str.startsWith("s")).forEach(t-> System.out.println(t));
	}

}
