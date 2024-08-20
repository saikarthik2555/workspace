package com.task1;

public class Program2 extends Thread {
	public Program2(String str) {
		super(str);
	}
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i+"    "+getName()); //predefined method
			try {
				Thread.sleep((int)(Math.random()*1000));    //sleep static method
			}catch(InterruptedException e) {
				System.out.println("Done   "+getName());
			}
		}
	}
	public static void main(String[] args) {
		
		new Program2("JSEE").start();
		//p.start();
		
		new Program2("HI").start();
		
	}

}
