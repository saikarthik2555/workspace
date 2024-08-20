package com.mcqs;

class A22 
{
public void printName()
{
System.out.println("Name-A");
}
}
class B22 extends A22
{
public void printName()
{
System.out.println("Name-B");
}
public void printValue() 
{
System.out.println("Value-B");
}
}
public class Test19
{
public static void main (String[] args)
{
A22 a = new A22();
B22 b = (B22)a;
b.printName();
}
}