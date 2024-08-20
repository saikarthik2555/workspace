package com.autoboxing;

public class Comparsion {
	public static void main(String[] args) {
		Integer c=Integer.valueOf(12);
		Integer j=Integer.valueOf(12);
		System.out.println(c==j);       //hashcode comparsion true becuase Integer is Object
		System.out.println(c.equals(j)); //content //true
		Integer a=new Integer(100);
		Integer b=new Integer(100);
		System.out.println(a==b);  		//false new keyword
										//non - SCP
		
		Integer d=Integer.valueOf(127);
		Integer e=Integer.valueOf(127);
		System.out.println(d==e);
		System.out.println(e.BYTES);
		Integer f=Integer.valueOf(128);
		Integer g=Integer.valueOf(128);
		System.out.println(f==g);		//false   yyy
		System.out.println(g.SIZE);
		Integer i = 128;
		System.out.println(i.byteValue());
		System.out.println(i.shortValue());
		System.out.println(i.intValue());
		System.out.println(i.longValue());
		System.out.println(i.floatValue());
		System.out.println(i.doubleValue());	
	}

}
