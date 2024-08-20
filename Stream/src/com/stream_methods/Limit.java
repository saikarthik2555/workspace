package com.stream_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Limit {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		Stream<Integer> specificList=l.stream().limit(5);
		specificList.forEach(t-> System.out.print(t));
	}

}
