package com.string_buffer;

public class StringBufferInsert
{
public static void main(String args[])
	{	
	long time=System.currentTimeMillis();
	String name="ToDay is Republic Day";  	//substring
	
	System.out.println(name.substring(4, 8));
		StringBuffer sb1=new StringBuffer("Hello");
		sb1.insert(1,"Java");
		sb1.append("maya");
	sb1.append(sb1.charAt(3));
		System.out.println(sb1);  //HJavaellov

		StringBuilder sb2=new StringBuilder("Hello");
		//System.out.println(sb2.deleteCharAt(1));
		
		sb2.insert(1,"Java");
		System.out.println(sb2);
long etime=System.currentTimeMillis();		
		System.out.println(etime-time);
	}
}
	