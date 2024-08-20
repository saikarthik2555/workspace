package com.yeild;

public class YieldSample {
	public static void main(String[] args) {
		Table t1=new Table(7);
		Table t2=new Table(5);
		t1.setPriority(7);
		t1.start();
		t2.setPriority(5);
		t2.start();
	}
}
class Table extends Thread{
int num;
	public Table(int num) {
		this.num=num;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(num*i+" "+Thread.currentThread().getPriority());
			if(Thread.currentThread().getId()==7) {
				Thread.yield();
				//if current thread having same/more priority then execute coming thread
				//else execute me
			}
			System.out.println(Thread.currentThread().getPriority());
		}
	}
}