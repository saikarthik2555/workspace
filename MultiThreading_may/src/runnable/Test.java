package runnable;

public class Test {
	public static void main(String[] args) {
		new Thread(new Demo()).start();
	}
}
class Demo implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable thread");
	}
	
}