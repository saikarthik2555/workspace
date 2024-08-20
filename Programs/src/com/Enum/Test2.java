package com.Enum;

public class Test2{
protected enum Color   // inside a class  -->   public || private  || static  || protected
{
	RED, BLUE, PINK;
}
public static void main(String []args) {
	Color a[]=Color.values();
	for(Color b:a) {
		System.out.println(b);
	}
}
}