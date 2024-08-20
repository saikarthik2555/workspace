package com.prg.practise;

public class MultipleThread {
	public static void main(String[] args) {
	String t1=	Thread.currentThread().getName();
	Sample s=new Sample();
	s.start();
	for(int i=1;i<=10;++i) {
		System.out.println("i value "+i+" by Thread "+t1);
		}
	}
}
class Sample extends Thread{
	@Override
	public void run() {
	String t2=	Thread.currentThread().getName();
	for(int i=1;i<=10;++i) {
	System.out.println("i value "+i+" by Thread "+t2);
	}
  }
}