package com.class_methods;

import java.lang.reflect.Field;

import java.lang.reflect.Method;

public class ClassDescription{
	public static void main(String[] args) throws Exception{
		Class c=Class.forName(args[0]);
		System.out.println(c.getClassLoader().getParent());
		System.out.println(c.getClassLoader().getParent().getDefinedPackages().getClass());
		System.out.println(c.getClassLoader().getName());
		System.out.println(c.getPackageName());
		
		Field[] fields=c.getDeclaredFields();
		for(Field field:fields) {
			System.out.println(field.getName());
		}
		
		Method[] methods=c.getDeclaredMethods();
		for(Method method:methods) {
			System.out.println(method.getName());
		}
		
	}
}