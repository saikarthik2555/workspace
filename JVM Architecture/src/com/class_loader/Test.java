package com.class_loader;

public class Test {
	public static void main(String[] args) {
		System.out.println("Test.class is loaded by"+Test.class.getClassLoader());
		System.out.println("Our classLoader is Application/system class loader is :"+Test.class.getClassLoader().getName());
		System.out.println("Super class for Application/system class loader is :"+Test.class.getClassLoader().getParent());
		System.out.println("Super class for Extension/platform class loader is :"+Test.class.getClassLoader().getParent().getName());
		System.out.println("Super class for Extension/platform class loader is :"+Test.class.getClassLoader().getParent().getParent());
	}

}
