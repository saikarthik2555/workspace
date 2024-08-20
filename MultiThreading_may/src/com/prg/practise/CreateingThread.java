package com.prg.practise;

public class CreateingThread {
	public static void main(String[] args) {
		Test t=new Test();
		t.start();
		//t.start();		//exception
	}

}
class Test extends Thread{
	@Override
	public void run() {
		System.out.println("Child thread called");
	}
	
	
}
