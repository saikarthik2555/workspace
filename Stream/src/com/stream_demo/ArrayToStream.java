package com.stream_demo;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
	public static void main(String[] args) {
		Integer arr[]=new Integer[5];
		arr[0]=523;
		arr[1]=234;
		arr[2]=345;
		arr[3]=456;
		arr[4]=567;
//		System.out.println(arr);	[I@6acbcfc0
		System.out.println(Arrays.toString(arr));
		Stream<Integer> s=Arrays.stream(arr);
		s.forEach(t-> System.out.println(t));
//		Stream<Integer> s=Stream.of(arr);
//		System.out.println(s instanceof Stream);
	}
}
