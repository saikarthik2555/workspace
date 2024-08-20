package com.string_buffer;

public class Capacity {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb.capacity());//default 16
		sb.append("Synchronization in Java is the process that allows only one thread at a particular time to complete a given task entirely.");
		System.out.println(sb.capacity());
		
	}

}
