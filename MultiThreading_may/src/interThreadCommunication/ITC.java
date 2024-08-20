package interThreadCommunication;

public class ITC {
	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName());
		Testt t=new Testt();
		t.start();
		synchronized(t) {	
			System.out.println("Current Thread :"+Thread.currentThread().getName());
			System.out.println("irst"+t);
			t.wait();		//release lock and and give to main it will provide to child thread
			//An object can give lock to only one thread at a time so this thread releases the lock
			System.out.println("I got lock and I will execute my remaining task  "+t.count);	
		}	
	}
}
class Testt extends Thread{
	
	int count=0;
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		t.setName("child-thread");
		System.out.println(Thread.currentThread().getName());
		synchronized(this) {		//waiting for lock from main 
			for(int i=1;i<=100;i++) {
				count=count+i;
			}
			notify();
			System.out.println("my work finisehd and ans is "+count);
		}
	}
}