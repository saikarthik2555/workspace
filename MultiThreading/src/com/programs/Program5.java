package com.programs;

public class Program5 extends Thread {

    public static void main(String[] args) throws Exception {
    Program5 t = new Program5();
    t.start();
    t.method();
    }
    @Override
    public void run() {
    System.out.println("run");
    }

    public void method() {
	hello();
    System.out.println("method");
}

public void hello()
	{
	hello1();
	System.out.println("PR");
	}

	public void hello1()
	{
	
	System.out.println("RR");
	}
}