package com.mcqs;

class AA
{
	//static               we cant declare suber method with static in abstract class 
	void foo()
	{
		System.out.println("A");
	}
static public void main (String[] args) 
{
AA a1 = new BB();
a1.foo();
}
}
class BB extends AA 
{
void foo()
{
	System.out.println("B"); 
}
}