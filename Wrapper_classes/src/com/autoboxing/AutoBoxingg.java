package com.autoboxing;
//up to java 1.4
//java software people use this method to convert primitive type to wrapper object 
//As the primitive cannot move in network but Object can...
//to convert we use valueOf();
public class AutoBoxingg extends Object{
	public AutoBoxingg() {
	super();
	}
	public static void main(String[] args) {
		System.out.println(Byte.MAX_VALUE);//1--> size
		System.out.println(Short.MAX_VALUE);//2
		System.out.println(Integer.MAX_VALUE);//4
		System.out.println(Byte.BYTES);//1 byte
		System.out.println(Byte.SIZE);//8 bits
		System.out.println(Long.MAX_VALUE);//8
		System.out.println(Float.MAX_VALUE);//4
		System.out.println(Double.MAX_VALUE);//8
		System.out.println(Character.MAX_VALUE);//2
		//System.out.println(Boolean.);//1
		
		//byte,short cannot directly assign to Integer--->type casting
		
		System.out.println();
		int a=123;
		Integer b=Integer.valueOf(a);	//up to 1.4
		System.out.println(b);
		
		int c=456;
		Integer d=c;	//1.5 onwards compier internally performing valueOf();
		System.out.println(d);
				
		short e=123;
		Integer f=(int)e;  //type casting
		byte g=127;
		// int h=g; //typecasting internally
		Integer i=(int)g;
		System.out.println(i);
		
		long j=2147483647;
		Integer k=(int)j;
		
		long l=2147483649L;
		Long m=l;
		System.out.println(m);
		int n=2147483647;
		Integer o=n;
		
		byte p=127;
		Byte q=p;
		short s=32767;
		Integer t=(int)s;
		String str="213";
		System.out.println(Integer.parseInt(str));
		System.out.println(Integer.BYTES);//4
		String s1=Integer.toString(14);
		System.out.println(s1);
	}

}
