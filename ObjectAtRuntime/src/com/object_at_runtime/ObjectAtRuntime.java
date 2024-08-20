package com.object_at_runtime;

public class ObjectAtRuntime {
	public static void main(String[] args) throws Exception{
		Object obj=Class.forName(args[0]).newInstance();
		System.out.println(obj.getClass());
		}
}