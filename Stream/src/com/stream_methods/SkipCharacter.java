package com.stream_methods;

import java.util.Arrays;
import java.util.List;

public class SkipCharacter {
	public static void main(String[] args) {
		List<Character> c=Arrays.asList('A','B','C','D','E','F','G');
		List<Character> skipAndLimit=c.stream().skip(1).limit(1).toList();
		System.out.println(skipAndLimit);
	}

}
