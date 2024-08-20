package com.programs;
class Simple extends Thread{
	public Simple(String str) {
		super(str);
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i+" "+getName());
			try {
				sleep((int)(Math.random()*1000));
			}catch(InterruptedException e) { 
				System.out.println("Not");
			}
		}
			System.out.println("Done"+getName());		
	}
}
public class Constructor {
	public static void main(String[] args) {
		new Simple("J2EE").start();
		new Simple("J2ME").start();
	}
}