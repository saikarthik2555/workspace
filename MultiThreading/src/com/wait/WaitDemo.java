package com.wait;

public class WaitDemo {
	public static void main(String[] args) {
		AssignTask a=new AssignTask();
		a.start();			//Thread-0 invokes run()
		synchronized(a)			//main Thread is having lock
		{	
			try {
				System.out.println("Waiting for a to complete ");
				System.out.println(Thread.currentThread().getName());
				//a.wait();	//releasing lock		//after releasing lock, waiting here   //another thread

//It will put a thread into temporarly waiting state and it will release the lock.

//It will wait till the another thread invokes notify() or notifyAll() for this object.
				System.out.println("another thread(Main thread) wake up");
			}catch(Exception e) {
				
			}
			
			System.out.println(a.x);
		}
		
	}

}
class AssignTask extends Thread{
	int x=0;
	public void run() { 			//thread comes
		synchronized(this) {		//here synchronized checks that
								//current execution thread is having lock or not
			//not having lock
			System.out.println(Thread.currentThread().getName());
			for(int i=0;i<=10;i++) {
				x=x+i;
				}
			System.out.println("Sending notification ");
			//notify();  //just sending notification
			//if notify() not present no error/exception
			//the child thread executes remaining task and send notification internally
			System.out.println("Am I printing"+Thread.currentThread().getName());
		}
		
	}
}