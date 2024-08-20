package com.mcqs;

class A1 
{
protected void printName(){
System.out.println("Value-A");
}
}
class B1 extends A1
{
public void printName(){
System.out.println("Name-B");
}
}
public class Test14
{
public static void main (String[] args) 
{
A1 b = new B1();
b.printName();
}
}