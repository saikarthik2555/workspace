package com.stream_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {
	public static void main(String[] args) {
		List<String> l=Arrays.asList("Monday","Tuesday","Wednesday","Thursday");
		List<String> sortedList=l.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
	}
}
