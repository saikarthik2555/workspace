package com.mcqs;

class First 
{
//public Object method1() //possible by type casting to down casting             //error because return type is Object and storing in String leads to downcasting 
public String method1()      //own     //String is storing in String
{
System.out.println("super method1");
return new String("Base");
}
}

class Second extends First 
{
@Override
public String method1() 
{
System.out.println("Subclass method1");
return new String("Derived");
}
}

public class Test13
{
public static void main(String[] args)
{
First f = new Second();
String s = f.method1();
System.out.println(s);
}

}