package com.mcqs;

class A11 
{
public void printName()
{
System.out.println("Value-A");
}
}
class B11 extends A11
{
public void printName()
{
System.out.println("Name-B");
}
}
public class Test16
{
public static void main (String[] args)
{
A11 b = new B11();
newPrint(b);
}
public static void newPrint(A11 a)
{
a.printName();
}
}