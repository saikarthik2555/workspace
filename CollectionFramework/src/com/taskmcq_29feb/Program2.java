package com.taskmcq_29feb;

import java.util.Arrays;
import java.util.List;

public class Program2 {
	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(5,6,7,8,9);
		lst.stream().filter(num ->num*num>50).forEach(num -> System.out.println(num));
	}
}
