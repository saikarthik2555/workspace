package com.programs;
class Testt extends Thread{
	public void run() {
		System.out.println("Run");
		super.run();
	}
	public synchronized void start() {
		System.out.println("Start");
		super.start();  //calling
		//super of start is run()
	}
}
public class Program3 {
	public static void main(String[] args) {
		nit();
	}
	public static void nit() {
		Testt t=new Testt();
		t.start();
	}

}
