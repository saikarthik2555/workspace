package com.stream_methods;

import java.util.Arrays;
import java.util.List;

public class distinctDemo {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,1,2,1,2,3,4,5,4,3,6,7,8,9,0);
		List<Integer> d=l.stream().distinct().toList();
		System.out.println(d);
		
	}

}
