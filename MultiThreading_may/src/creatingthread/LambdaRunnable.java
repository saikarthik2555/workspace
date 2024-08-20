package creatingthread;

public class LambdaRunnable {
	public static void main(String[] args) {
		Runnable r=()->{
			System.out.println("child Thread :"+Thread.currentThread().getName());
		};
		new Thread(r,"child-0").start();
	}

}
