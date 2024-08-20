package com.deadlock;
//Not Understood
//DOUBT
public class DeadLock {
	public static void main(String[] args) {
		String resourse1="Ameerpet";
		String resourse2="Hyderabad";
		Thread t1=new Thread() {
			public void run() {
				synchronized(resourse1) {
					System.out.println("Thread :1 locked resourse 1");
					try {
						Thread.sleep(1000);
					}catch(Exception e) {}
					synchronized(resourse2) {
						System.out.println("Thread:1 locked resourse 2");
					}
				}
			}
		};
		Thread t2=new Thread() {
			public void run() {
				synchronized(resourse2) {
					System.out.println("Thread :2 locked resourse 2");
					try {
						Thread.sleep(1000);
					}catch(Exception e) {}
					synchronized(resourse1) {
						System.out.println("Thread :2 locked resourse1");;
					}
				}
			}
		};
		t1.start();
		t2.start();
	}

}
