package com.class_loader;

public class SeeThis {
	public static void main(String[] args) {
		System.out.println(java.lang.String.class.getClassLoader());
		System.out.println(SeeThis.class.getClassLoader().getName());
		System.out.println(com.static_block.StaticBlockDemo.class.getName());
	}

}
