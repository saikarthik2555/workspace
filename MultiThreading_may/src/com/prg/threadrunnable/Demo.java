package com.prg.threadrunnable;

public class Demo {
public static void main(String[] args) {
		Runnable r=()->{
			System.out.println("child thread    "+Thread.currentThread().getName());
		};
		new Thread(r,"child-0").start();
		new Thread(r,"child-1").start();
		
	}
}
