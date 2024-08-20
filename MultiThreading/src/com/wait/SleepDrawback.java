package com.wait;
//	Drawback is main() should wait for execution of run method
//but is not waiting so use Sleep
//drawback of sleep--> should wait for atleast 1 ms to complete run() method
public class SleepDrawback {
	public static void main(String[] args)  {
		Test t=new Test();
		Thread t1=new Thread(t);
		t1.start();
		try {
			Thread.sleep(200);   //atleat wait main Thread for 1ms the child thread will execute its task
		}catch(Exception e) {
			
		}
		System.out.println(t.var);
		}
		
	}

class Test implements Runnable {
	int var=0;
	public void run() {

		for(int i=0;i<100;i++) {
			var=var+i;
			try {
				Thread.sleep(200);
			}
			catch(Exception e) {
				
			}
		}
	}
}