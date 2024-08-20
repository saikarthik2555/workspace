package com.consumer_interface;

import java.util.function.Consumer;

public class Sample {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		Consumer<Integer> c=(i)-> System.out.print(i+" ");
		for(int i=0;i<arr.length;++i) {
			c.accept(arr[i]);
		}
	}
}
//foreachRemaining using Consumer as parameter
