package com.class_loader;

import java.util.Arrays;

public class Sample implements Say{
	public String toString() {
		return "dfggsf";
	}
	public static void main(String[] args) {
	System.out.println(Sample.class.getClassLoader().getDefinedPackages());
	System.out.println(Sample.class.getClassLoader());
	System.out.println(Sample.class.getClassLoader().getParent());
	System.out.println(Sample.class.getClassLoader());
	System.out.println(Sample.class.getClassLoader().getParent().getParent());
	Object.class.getName();
	Class c=Sample.class;
	Class d=Class.class;
	System.out.println(Arrays.toString(d.getInterfaces()));
	System.out.println(Arrays.toString(c.getInterfaces()).toString());
//	Class b=byte.class;
//	System.out.println(b.getMethods().toString());
//	System.out.println(c.getDeclaredClasses());
	System.out.println(c.getName());
//	System.out.println(c.toString());
	}
	@Override
	public void run() {
		
	}
}
interface Say{
	public abstract void run();
}