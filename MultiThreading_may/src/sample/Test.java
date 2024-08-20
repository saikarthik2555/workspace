package sample;

public class Test extends Thread{
	public static void main(String[] args) {
		Test t=new Test();
		t.start();
		System.out.println(t.getName()+" running on "+t.currentThread().getName());		//Thread-0 but running on main Thread
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread());
	}
	@Override
	public void run() {
		System.out.println("name  is Thread-0 "+Thread.currentThread());
	}
}
