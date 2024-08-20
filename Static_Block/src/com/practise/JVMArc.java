package com.practise;

public class JVMArc {
	public static void main(String[] args) {
		System.out.println(JVMArc.class.getClassLoader().getParent().getParent());
//bootstarp/primordial class loader implementer cannot be provided by java software people
		System.out.println(JVMArc.class.getClass());
	}
}
