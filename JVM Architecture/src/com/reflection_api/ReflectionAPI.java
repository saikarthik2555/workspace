package com.reflection_api;

//one of the way to load .class file in to JVM
//reflection api--> in java.lang package we have predefined class called Class having predefined static method
//forName(String className) whose return type is java.lang.Class.
//A method whose return type is same class known as Factory Method

public class ReflectionAPI {
	public static void main(String[] args) throws Exception {
		//Class.forName("com.reflection_api.Tes");// java.lang.ClassNotFoundException
		Class.forName("com.reflection_api.Test");

	}

}
