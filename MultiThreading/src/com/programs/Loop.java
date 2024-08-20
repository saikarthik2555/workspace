package com.programs;


class Sample extends Thread{
	@Override
	public void run() {
		Thread name=Thread.currentThread();//Thread-0
		name.setName("Child");
		for(int i=1;i<11;i++) {
		System.out.println(i+" "+name.getName());
		}
	}
}
public class Loop {
	public static void main(String[] args) {
		boolean count=true;
		count=false;
		System.out.println(count);
//		Sample s=new Sample();
//		s.start();
//		Thread name=Thread.currentThread();
//		name.setName("Ayya");
//		name.setName("Baab");
//		name.setName("Parent");
//		for(int i=0;i<=10;i++) {
//			System.out.println(i+" "+name.getName());//main
//		}
//		int x=1;
//		do {
//			System.out.println("hello");
//			x++;
//			
//		}while(x<=10);
	}

}
