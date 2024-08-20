package com.mcqs;

class A3 
{
public void printName()
{
System.out.println("Value-A");
}
}
class B3 extends A3
{
public void printName()
{
System.out.println("Name-B");
}
}
class C3 extends A3
{
public void printName()
{
System.out.println("Name-C");
}
}
public class Test17
{
public static void main (String[] args) 
{
//B3	b = new B3();         //error because B3 is not having any relation to C3
A3	b = new B3();            //No error because B3 And C3 having realtion through A3 
C3 c = new C3();
b = c;
newPrint(b);
}
public static void newPrint(A3 a)
{
a.printName();
 }
 }