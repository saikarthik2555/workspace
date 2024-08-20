package com.stream_methods;

import java.util.stream.Stream;

public class DropWhile {
	public static void main(String[] args) {
		Stream<Integer> s=Stream.of(1,2,3,4,5,5,4,3,2,1);
		s.dropWhile(num-> num<5).forEach(t-> System.out.print(t+" "));
	}
}
