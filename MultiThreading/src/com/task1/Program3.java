package com.task1;

public class Program3 extends Thread {
	static Thread	t;	//Has a relation
	public static void main(String[] args) {
		t=new Thread();
	t.start();
	new Program3();
	}

}
