package com.Program01;
/*
//heap memory				2nd time		3rd time
 * t1:1000x,val=100;
 * Test: 2000x,t=null   5000x
 * t2:3000x,val=200;
 * Test:4000x,t=1000x;	5000x              3000x
 * t3:5000x,val=300
 * Test:6000x,t=1000x;	7000x
 * t4:7000x,val=400;
 * Test:8000x,t=3000x
 
//main_stack
 * t1:1000x;
 * t2:3000x
 * t3:5000x;
 * t4:7000x

*/
public class Test 
{
	Test t;
	int val;

	public Test(int val)
	{
		this.val = val;
	}

	public Test(int val, Test t)
	{
		this.val = val;
		this.t = t;
	}

	
	public static void main(String[] args) 
	{
		Test t1 = new Test(100);
		Test t2 = new Test(200,t1);
		Test t3 = new Test(300,t1);
		Test t4 = new Test(400,t2);

		t2.t = t3; 
		t3.t = t4;
		t1.t = t2.t;
		t2.t = t4.t;

		System.out.println(t1.t.val);
		System.out.println(t2.t.val);
		System.out.println(t3.t.val);
		System.out.println(t4.t.val);
	}
	
}